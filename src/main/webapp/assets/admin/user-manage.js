$(function (){
	var $wrapper = $('#div-table-container');
	var $table = $('#table-user');
	var _table = $table.dataTable($.extend(true,{},CONSTANT.DATA_TABLES.DEFAULT_OPTION, {
		ajax : function(data, callback, settings) {//ajax配置为function,手动调用异步查询
			//手动控制遮罩
			$wrapper.spinModal();
			//封装请求参数
			var param =userManage.getQueryCondition(data);
			$.ajax({
		            type: "POST",
		            url: basePath+"/user/dataGrid",
		            cache : false,	//禁用缓存
		            data: param,	//传入已封装的参数
		            dataType: "json",
		            success: function(result) {
		            	//alert(result.rows);
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
		                //parent.ha_close_load();
		            }
		        });
		},
        columns: [
            CONSTANT.DATA_TABLES.COLUMN.CHECKBOX,
            {
            	className : "ellipsis",	//文字过长时用省略号显示，CSS实现
            	data: "loginname",
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
            	data: "organizationName",
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "80px"			
            },
            {
            	className : "ellipsis",	
            	data: "createdate",
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "80px"			
            },
            {
            	className : "ellipsis",	
            	data: "phone",
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "80px"			
            },
           
            {
            	className : "ellipsis",	
            	data: "cardNo",
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "80px"			
            },
            
			{
				data : "status",
				width : "80px",
				render : function(data,type, row, meta) {
					return '<i class="fa fa-male"></i> '+(data?"在线":"离线");
				}
			},
			{
				data : "usertype",
				width : "80px",
				render : function(data,type, row, meta) {
					return '<i class="fa fa-male"></i> '+((data==1)?"后台用户":"前台用户");
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
        	$('td', row).eq(7).addClass(data.status?"text-success":"text-error");
        	//不使用render，改用jquery文档操作呈现单元格
            var $btnEdit = $('<button type="button" class="btn btn-small btn-primary btn-edit">修改</button>');
            var $btnDel = $('<button type="button" class="btn btn-small btn-danger btn-del">删除</button>');
            $('td', row).eq(9).append($btnEdit).append($btnDel);
            
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
		userManage.addItemInit();
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
	//添加保存按钮
	$("#btn-save-add").click(function(){
		userManage.addItemSubmit(_table);
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
	
	$("#toggle-advanced-search").click(function(){
		$("i",this).toggleClass("fa-angle-double-down fa-angle-double-up");
		$("#div-advanced-search").slideToggle("fast");
	});
	
	$("#btn-info-content-collapse").click(function(){
		$("i",this).toggleClass("fa-minus fa-plus");
		$("span",this).toggle();
		$("#user-view .info-content").slideToggle("fast");
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
		var param = {};
		//组装排序参数
		if (data.order&&data.order.length&&data.order[0]) {
			switch (data.order[0].column) {
			case 1:
				param.sort = "loginname";
				break;
			case 2:
				param.sort = "name";
				break;
			case 3:
				param.sort = "organizationName";
				break;
			case 4:
				param.sort = "createdate";
				break;
			case 5:
				param.sort = "phone";
				break;
			case 5:
				param.sort = "status";
				break;
			default:
				param.sort = "createdate";
				break;
			}
			param.order = data.order[0].dir;
		}
		//组装查询参数
		param.fuzzySearch = userManage.fuzzySearch;
		if (userManage.fuzzySearch) {
			param.fuzzy = $("#fuzzy-search").val();
		}else{
			param.loginname = $("#loginname-search").val();
			param.name = $("#name-search").val();
			param.organizationId = $("#organization-search").val();
			param.id = $("#id-search").val();
		}
		//组装分页参数
		param.page = parseInt(data.start/data.length)+1;
		param.rows = data.length;
		param.draw = data.draw;
		
		return param;
	},
	showItemDetail : function(item) {
		//alert(JSON.stringify(item));
		$("#user-view").show().siblings(".info-block").hide();
		if (!item) {
			$("#user-view .prop-value").text("");
			return;
		}
		$("#id-view").text(item.id);
		$("#loginname-view").text(item.loginname);
		
		$("#name-view").text(item.name);
		$("#organization-view").text(item.organizationName);
		$("#phone-view").text(item.phone);
		
		$("#cardNo-view").text(item.cardNo);
		$("#usertype-view").text((item.usertype==1)?"后台用户":"前台用户");
		var roleName=[];
		$.each(item.rolesList, function(i,val){     
			roleName.push(val.name);
		});
		$("#roleIds-view").text(roleName.join());
		//$("#status-view").text(item.roleIds?"超级管理员":"测试账户");
		$("#status-view").text(item.status?"在线":"离线");
	},
	addItemInit : function() {
		
		$("#form-add")[0].reset();
		
		$("#user-add").show().siblings(".info-block").hide();
	},
	editItemInit : function(item) {
		if (!item) {
			return;
		}
		$("[name='roleIds']").removeAttr("checked");
		$.each(item.rolesList, function(i,val){
			$("#edit_role_"+val.id).attr("checked", true);
		});
		
		$("#form-edit")[0].reset();
		$("#title-edit").html(item.loginname);
		$("#id-edit").val(item.id);
		$("#loginname-edit").val(item.loginname);
		$("#name-edit").val(item.name);
		$("#roleIds-edit").val(item.roleIds);
		$("#cardNo-edit").val(item.cardNo);
		$("#phone-edit").val(item.phone);
		$("#usertype-edit").val(item.usertype);
		$("#organizationId-edit").val(item.organizationId);
		$("#user-edit").show().siblings(".info-block").hide();
	},
	addItemSubmit : function(_table) {
		//检查数据，用户名，密码不能为空
		if($("#loginname-add").val()=="" || $("#password-add").val()==""){
			//parent.ha_error("数据错误","请输入用户名和密码！");
			return false;
		}
		if($('input[name="roleIds"]:checked').length<=0){
			//parent.ha_error("数据错误","请至少为当前用户选择一个角色！");
			return false;
		}
		//parent.ha_load("正在提交数据...");
		$.dialog.tips("正在提交数据...");
		$.ajax({
            type: "POST",
            dataType: "html",
            url: basePath+"/user/add",
            data: $('#form-add').serialize(),
            success: function (data) {
            	var obj=$.parseJSON( data );
            	if(obj.success==true){
//            		parent.ha_success("添加成功","用户数据已经添加成功");
            		$.dialog.tips("添加成功","用户数据已经添加成功");
            		setTimeout(function(){
            			_table.ajax.reload();
            			//parent.ha_close_load();
    				}, 2000);
            	}else{
            		//parent.ha_error("添加失败",obj.msg);
            		$.dialog.tips("添加失败",obj.msg);
            	}
            },
            error: function(data) {
            	//parent.ha_error("添加失败","未知错误！！");
            	$.dialog.tips("添加失败","未知错误！！");
             }
        });
	},
	editItemSubmit : function(_table) {
		//parent.ha_load("正在提交数据...");
		$.ajax({
            type: "POST",
            dataType: "html",
            url: basePath+"/user/edit",
            data: $('#form-edit').serialize(),
            success: function (data) {
            	var obj=$.parseJSON( data );
            	if(obj.success==true){
//            		parent.ha_success("修改成功","用户数据已经修改成功");
                	$.dialog.tips("修改成功","用户数据已经修改成功");
            		setTimeout(function(){
            			_table.draw(false);
    				}, 2000);
            	}else{
            		//parent.ha_error("修改失败",obj.msg);
            		$.dialog.tips("修改成功","用户数据已经修改成功");
            		
            	}
            },
            error: function(data) {
            	//parent.ha_error("修改失败","未知错误！！");
            }
        });
		$.dialog.tips('保存当前编辑用户');
	},
	deleteItem : function(selectedItems,_table) {
		var message;
		if (selectedItems&&selectedItems.length) {
			if (selectedItems.length == 1) {
				message = "确定要删除 '"+selectedItems[0].loginname+"("+selectedItems[0].name+")' 吗?";
				
			}else{
				message = "确定要删除选中的"+selectedItems.length+"项记录吗?";
			}
//			parent.ha_confirm("确定删除",message,function(){
			$.dialog.confirmDanger(message, function(){
				//选中的全部删除
				while(selectedItems.length>0){
					$.ajax({
			            dataType: "json",
			            url: basePath+"/user/delete",
			            data: {id:selectedItems[selectedItems.length-1].id},
			            success: function (data) {
//			            	parent.ha_success('删除成功','选中的用户数据已删除！');
			            	$.dialog.tips('删除成功','选中的用户数据已删除！');
		            		setTimeout(function(){
		            			_table.draw(true);
		            			
		    				}, 2000);
			           	 	
			            },
			            error: function(data) {
//			            	parent.ha_success('删除失败','网络错误！');
			            	$.dialog.tips('删除失败','网络错误！');
			             }
			        });
					selectedItems.length--;
				}
			});
		}else{
			//parent.ha_error('删除失败','请先选中要操作的行');
			$.dialog.tips('删除失败','请先选中要操作的行');
		}
	}
};