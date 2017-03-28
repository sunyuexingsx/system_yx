$(function (){
	var $wrapper = $('#div-table-container');
	var $table = $('#table-user');
	var _table = $table.dataTable($.extend(true,{},CONSTANT.DATA_TABLES.DEFAULT_OPTION, {
		ajax : function(data, callback, settings) {//ajax配置为function,手动调用异步查询
			//手动控制遮罩
			$wrapper.spinModal();
			//parent.ha_load("正在努力加载数据....");
			//封装请求参数
			var param =userManage.getQueryCondition(data);
			$.ajax({
		            type: "POST",
		            url: basePath+"/resource/dataGrid",
		            cache : false,	//禁用缓存
		            data: param,	//传入已封装的参数
		            dataType: "json",
		            success: function(result) {
		            	//setTimeout仅为测试遮罩效果
		            	setTimeout(function(){
		            		//异常判断与处理
		            		if (result.errorCode) {
		            			$.dialog.alert("查询失败。错误码："+result.errorCode);
		            			return;
							}
		            		//封装返回数据，这里仅演示了修改属性名
		            		var returnData = {};
			            	returnData.draw = data.draw;//这里直接自行返回了draw计数器,应该由后台返回
			            	returnData.recordsTotal = result.total;
			            	returnData.recordsFiltered = result.total;//后台不实现过滤功能，每次查询均视作全部结果
			            	returnData.data = result.rows;
			            	//关闭遮罩
			            	$wrapper.spinModal(false);
			            	//parent.ha_close_load();
			            	//调用DataTables提供的callback方法，代表数据已封装完成并传回DataTables进行渲染
			            	//此时的数据需确保正确无误，异常判断应在执行此回调前自行处理完毕
			            	callback(returnData);
		            	},200);
		            },
		            error: function(XMLHttpRequest, textStatus, errorThrown) {
		                $.dialog.alert("查询失败");
		                $.dialog.alert("textStatus:"+textStatus);
		                $.dialog.alert("errorThrown:"+errorThrown);
		                $wrapper.spinModal(false);
		            }
		        });
		},
        columns: [
            CONSTANT.DATA_TABLES.COLUMN.CHECKBOX,
            {
            	className : "ellipsis",	//文字过长时用省略号显示，CSS实现
            	data: "id",
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,//会显示省略号的列，需要用title属性实现划过时显示全部文本的效果
            	width : "80px"
            },
            {
            	className : "ellipsis",	
            	data: "name",
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
            	//固定列宽，但至少留下一个活动列不要固定宽度，让表格自行调整。不要将所有列都指定列宽，否则页面伸缩时所有列都会随之按比例伸缩。
				//切记设置table样式为table-layout:fixed; 否则列宽不会强制为指定宽度，也不会出现省略号。
				width : "80px"			
            },
            {
            	className : "ellipsis",	
            	data: "url",
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "80px"			
            },
           /* {
            	className : "ellipsis",	
            	data: "seq",
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "80px"			
            },*/
            {
            	className : "ellipsis",	
            	data: "description",
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,	
				width : "80px"			
            },
            {
            	className : "ellipsis",	
            	data: "resourcetype",
            	render : function(data,type, row, meta) {
					return data?"按钮":"菜单";
				},
				width : "80px"
            },
			{
				data : "status",
				width : "80px",
				render : function(data,type, row, meta) {
					return '<i class="fa fa-male"></i> '+(data?"启用":"停用");
				}
			},
			 {
				className : "td-operation",
				data: null,
				defaultContent:"",
				orderable : false,
				width : "120px"
			}
        ],
        "createdRow": function ( row, data, index ) {
        	//行渲染回调,在这里可以对该行dom元素进行任何操作
        	//给当前行加样式
        	if (data.role) {
        		$(row).addClass("info");
			}
        	//给当前行某列加样式
        	$('td', row).eq(6).addClass(data.status?"text-success":"text-error");
        	//不使用render，改用jquery文档操作呈现单元格
            var $btnEdit = $('<button type="button" class="btn btn-small btn-primary btn-edit">修改</button>');
            var $btnDel = $('<button type="button" class="btn btn-small btn-danger btn-del">删除</button>');
            $('td', row).eq(7).append($btnEdit).append($btnDel);
            
        },
        "drawCallback": function( settings ) {
        	//渲染完毕后的回调
        	//清空全选状态
			$(":checkbox[name='cb-check-all']",$wrapper).prop('checked', false);
        	//默认选中第一行
        	$("tbody tr",$table).eq(0).click();
        }
	})).api();//此处需调用api()方法,否则返回的是JQuery对象而不是DataTables的API对象
	
	
	$("#btn-add").click(function(){
    	userManage.addItemInit(_table);
	});
	$("#btn-del").click(function(){
		var arrItemId = [];
        $("tbody :checkbox:checked",$table).each(function(i) {
        	var item = _table.row($(this).closest('tr')).data();
        	arrItemId.push(item);
        });
		userManage.deleteItem(arrItemId,_table);
	});
	
	$("#btn-simple-search").click(function(){
		userManage.fuzzySearch = true;
		
		//reload效果与draw(true)或者draw()类似,draw(false)则可在获取新数据的同时停留在当前页码,可自行试验
//		_table.ajax.reload();
//		_table.draw(false);
		_table.draw();
	});
	
	$("#btn-advanced-search").click(function(){
		userManage.fuzzySearch = false;
		_table.draw();
	});
	 $("#form-add").validate({
		//debug:true,
		rules:{
			name:{
				required:true,
			},
			url:{
				url:true ,
			},
			status:{
				required:true,
			},
			pid:{
				required:true,
			},
			resourcetype:{
				required:true,
			}
		},
		messages : {
			name :{
				required: "请输入资源名称"
				},
			url : {
				url : "请输入正确的路径"
			},
			status:{
				required: "请选择一项"
			},
			pid:{
				required: "请选择一项"
			},
			resourcetype:{
				required: "请选择一项"
			}
		},
		
	});
	/* jQuery.validator.addMethod("selectNone",function(value, element){  
         return value=='';  
    },"请选择一项");*/
//	validator.resetForm();
	/*$("#form-add").validate({
		errorPlacement: function(error, element) { //错误信息位置设置方法
			 if ( element.is(":radio") ){
				 error.appendTo( element.parent().next().next() );
			 }else if ( element.is(":checkbox") ){
				 error.appendTo ( element.next() );
			 } else{
				 error.appendTo( element.parent().next() );//这里的element是录入数据的对象
			 }
		}
	});*/
	//添加保存按钮
	$("#btn-save-add").click(function(){	
		//表单校验
		if($("#form-add").valid()){
			userManage.addItemSubmit(_table);
		}else{
			$("#form-add").validate();
		}
	});
	
	$("#btn-save-edit").click(function(){
		userManage.editItemSubmit(_table);
	});
	
	//行点击事件
	$("tbody",$table).on("click","tr",function(event) {
		$(this).addClass("active").siblings().removeClass("active");
		//获取该行对应的数据
		var item = _table.row($(this).closest('tr')).data();
		userManage.currentItem = item;
		userManage.showItemDetail(item);
    });
	
	$table.on("change",":checkbox",function() {
		if ($(this).is("[name='cb-check-all']")) {
			//全选
			$(":checkbox",$table).prop("checked",$(this).prop("checked"));
		}else{
			//一般复选
			var checkbox = $("tbody :checkbox",$table);
			$(":checkbox[name='cb-check-all']",$table).prop('checked', checkbox.length == checkbox.filter(':checked').length);
		}
    }).on("click",".td-checkbox",function(event) {
    	//点击单元格即点击复选框
    	!$(event.target).is(":checkbox") && $(":checkbox",this).trigger("click");
    }).on("click",".btn-edit",function() {
    	//点击编辑按钮
        var item = _table.row($(this).closest('tr')).data();
		$(this).closest('tr').addClass("active").siblings().removeClass("active");
		userManage.currentItem = item;
		userManage.editItemInit(item);
	}).on("click",".btn-del",function() {
		//点击删除按钮
		var item = _table.row($(this).closest('tr')).data();
		$(this).closest('tr').addClass("active").siblings().removeClass("active");
		userManage.deleteItem([item],_table);
	});
	
	
	
	$("#btn-view-edit").click(function(){
		userManage.editItemInit(userManage.currentItem);
	});
	
	$(".btn-cancel").click(function(){
		userManage.showItemDetail(userManage.currentItem);
	});
	
	
});

var userManage = {
	currentItem : null,
	fuzzySearch : true,
	getQueryCondition : function(data) {
		//alert("传参data"+JSON.stringify(data));
		var param = {};
		//组装排序参数
		param.sort = "id";
		param.order = "asc";
		//组装查询参数
		
		//组装分页参数
		param.page = parseInt(data.start/data.length)+1;
		param.rows = data.length;
		param.draw = data.draw;
		//alert("parampage:"+param.page)
		return param;
	},
	showItemDetail : function(item) {
		$("#resource-view").show().siblings(".info-block").hide();
		if (!item) {
			$("#resource-view .prop-value").text("");
			return;
		}
		$("#id-view").text(item.id);
		$("#name-view").text(item.name);
		$("#url-view").text(item.url);
		$("#icon-view").text(item.icon);
		$("#pid-view").text(item.description);
//		alert("item.pid:"+item.pid);
		/*var id = item.pid;
		$.ajax({
            url: basePath+"/resource/pid",
            dataType: "json",
            data: {"pid":id},
            success: function (data) {
            	//alert("传参data"+JSON.stringify(data));
            	if(data==null){
            		$("#pid-view").text("无上级");
            		return;
            	}
            	$("#pid-view").text(data.name);
            },
            error: function(data) {
           	 $.dialog.tips('pid失败');
             }
		});*/
		$("#seq-view").text(item.seq);
		$("#createdate-view").text(item.createdate);
		$("#resourcetype-view").text(item.resourcetype?"按钮":"菜单");
		$("#description-view").text(item.description);
		$("#status-view").text(item.status?"启用":"停用");
	},
	addItemInit : function(item) {
		
		$("#form-add")[0].reset();
		
		$("#resource-add").show().siblings(".info-block").hide();
	},
	editItemInit : function(item) {
		if (!item) {
			return;
		}
		$("#form-edit")[0].reset();
		$("#id-edit").val(item.id);
		$("#name-edit").val(item.name);
		$("#url-edit").val(item.url);
		$("#icon-edit").val(item.icon);
		$("#seq-edit").val(item.seq);
		$("#pid-edit").val(item.pid);
		$("#resourcetype-edit").val(item.resourcetype);
		$("#createdate-edit").val(item.createdate);
		$("#status-edit").val(item.status);
		$("#description-edit").val(item.description);
		$("#resource-edit").show().siblings(".info-block").hide();
	},
	
	addItemSubmit : function(_table ) {
		
		
		var $wrapper = $('#div-table-container');
		$wrapper.spinModal();
		$.ajax({
            type: "POST",
            dataType: "html",
            url: basePath+"/resource/add",
            data: $('#form-add').serialize(),
            success: function (data) {
            	setTimeout(function(){
            		$wrapper.spinModal(false);
    	         	_table.draw(true);
    	         	$.dialog.tips('保存成功');
            	},1000);
            },
            error: function(data) {
            	$wrapper.spinModal(false);
           	 	$.dialog.tips('保存失败');
             }
        });
	},
	editItemSubmit : function(_table) {
		
		var $wrapper = $('#div-table-container');
		//$.dialog.tips('保存当前编辑用户......');
		$wrapper.spinModal();
		$.ajax({
            type: "POST",
            dataType: "html",
            url: basePath+"/resource/edit",
            data: $('#form-edit').serialize(),
            success: function (data) {
            	setTimeout(function(){
            		$wrapper.spinModal(false);
            		_table.draw(true);
            		$.dialog.tips('修改成功');
            	},1000);
            },
            error: function(data) {
           	 	$wrapper.spinModal(false);
           	 	$.dialog.tips('修改失败');
             }
        });
	},
	deleteItem : function(selectedItems,_table) {
		//alert(JSON.stringify(selectedItems));
		var $wrapper = $('#div-table-container');
		var message;
		if (selectedItems&&selectedItems.length) {
			if (selectedItems.length == 1) {
				message = "确定要删除 '"+selectedItems[0].name+"' 吗?";
				
			}else{
				message = "确定要删除选中的"+selectedItems.length+"项记录吗?";
			}
			
			$.dialog.confirmDanger(message, function(){
				$wrapper.spinModal();
				//选中的全部删除
				while(selectedItems.length>0){
					$.ajax({
			            dataType: "json",
			            url: basePath+"/resource/delete",
			            data: {id:selectedItems[selectedItems.length-1].id},
			            success: function (data) {
			            	setTimeout(function(){
			    	         	$wrapper.spinModal(false);
			    	         	_table.draw(true);
			    	         	$.dialog.tips('删除成功');
			            	},1000);
			            },
			            error: function(data) {
			           	 	$wrapper.spinModal(false);
			           	 	$.dialog.tips('删除失败');
			            }
			        });
					selectedItems.length--;
				}
			});
		}else{
			$.dialog.tips('请先选中要操作的行');
		}
	}
};