$(function (){
	$('#res_list').nestable();
	var $wrapper = $('#div-table-container');
	var $table = $('#table-role');
	var _table = $table.dataTable($.extend(true,{},CONSTANT.DATA_TABLES.DEFAULT_OPTION, {
		ajax : function(data, callback, settings) {//ajax配置为function,手动调用异步查询
			//手动控制遮罩
			$wrapper.spinModal();
			//parent.ha_load("正在努力加载数据....");
			//封装请求参数
			var param =roleManage.getQueryCondition(data);
			$.ajax({
		            type: "POST",
		            url: basePath+"/role/dataGrid",
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
			            	//parent.ha_close_load();
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
            	data: "name",
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,//会显示省略号的列，需要用title属性实现划过时显示全部文本的效果
            	width : "80px"
            },
            {
            	className : "ellipsis",	
            	data: "description",
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "80px"			
            },
            
			{
				data : "status",
				width : "80px",
				render : function(data,type, row, meta) {
					return '<i class="fa fa-male"></i> '+(data?"禁用":"可用");
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
        	$('td', row).eq(3).addClass(data.status?"text-error":"text-success");
        	//不使用render，改用jquery文档操作呈现单元格
        	var $btnRole = $('<button type="button" class="btn btn-small btn-success btn-role">授权</button>');
            var $btnEdit = $('<button type="button" class="btn btn-small btn-primary btn-edit">修改</button>');
            var $btnDel = $('<button type="button" class="btn btn-small btn-danger btn-del">删除</button>');
            $('td', row).eq(4).append($btnRole).append($btnEdit).append($btnDel);
            
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
		roleManage.addItemInit();
	});
	
	$("#btn-del").click(function(){
		var arrItemId = [];
        $("tbody :checkbox:checked",$table).each(function(i) {
        	var item = _table.row($(this).closest('tr')).data();
        	arrItemId.push(item);
        });
		roleManage.deleteItem(arrItemId,_table);
	});
	
	$("#btn-simple-search").click(function(){
		roleManage.fuzzySearch = true;
		
		//reload效果与draw(true)或者draw()类似,draw(false)则可在获取新数据的同时停留在当前页码,可自行试验
//		_table.ajax.reload();
//		_table.draw(false);
		_table.draw();
	});
	
	$("#btn-advanced-search").click(function(){
		roleManage.fuzzySearch = false;
		_table.draw();
	});
	//添加保存按钮
	$("#btn-save-add").click(function(){
		roleManage.addItemSubmit(_table);
	});
	
	$("#btn-save-edit").click(function(){
		roleManage.editItemSubmit(_table);
	});
	//授权保存按钮
	$("#btn-res-edit").click(function(){
		
		roleManage.editItemResSubmit(_table);
	});
	//行点击事件
	$("tbody",$table).on("click","tr",function(event) {
		$(this).addClass("active").siblings().removeClass("active");
		//获取该行对应的数据
		var item = _table.row($(this).closest('tr')).data();
		roleManage.currentItem = item;
		roleManage.showItemDetail(item);
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
		roleManage.currentItem = item;
		roleManage.editItemInit(item);
	}).on("click",".btn-role",function() {
    	//点击授权按钮
		$("[name='resIds']").removeAttr("checked");
        var item = _table.row($(this).closest('tr')).data();
		$(this).closest('tr').addClass("active").siblings().removeClass("active");
		roleManage.currentItem = item;
		roleManage.roleItemInit(item);
	}).on("click",".btn-del",function() {
		//点击删除按钮
		var item = _table.row($(this).closest('tr')).data();
		$(this).closest('tr').addClass("active").siblings().removeClass("active");
		roleManage.deleteItem([item],_table);
		
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
		roleManage.editItemInit(roleManage.currentItem);
	});
	
	$(".btn-cancel").click(function(){
		roleManage.showItemDetail(roleManage.currentItem);
	});
});

var roleManage = {
	currentItem : null,
	wrapper : $('#div-table-container'),
	fuzzySearch : true,
	getQueryCondition : function(data) {
		var param = {};
		//组装排序参数
		if (data.order&&data.order.length&&data.order[0]) {
			switch (data.order[0].column) {
			case 1:
				param.sort = "name";
				break;
			case 2:
				param.sort = "description";
				break;
			case 3:
				param.sort = "status";
				break;
			default:
				param.sort = "name";
				break;
			}
			param.order = data.order[0].dir;
		}
		//组装查询参数
		param.fuzzySearch = roleManage.fuzzySearch;
		if (roleManage.fuzzySearch) {
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
		$("#role-view").show().siblings(".info-block").hide();
		if (!item) {
			$("#role-view .prop-value").text("");
			return;
		}
		$("#id-view").text(item.id);
		$("#name-view").text(item.name);
		
		$("#name-view").text(item.name);
		$("#description-view").text(item.description);
		
		$("#status-view").text(item.status?"禁用":"可用");
	},
	addItemInit : function() {
		
		$("#form-add")[0].reset();
		
		$("#role-add").show().siblings(".info-block").hide();
	},
	editItemInit : function(item) {
		if (!item) {
			return;
		}
		
		$("#form-edit")[0].reset();
		$("#title-edit").html(item.name);
		$("#id-edit").val(item.id);
		$("#name-edit").val(item.name);
		$("#description-edit").val(item.description);
		$("#status-edit").val(item.status);
		
		$("#role-edit").show().siblings(".info-block").hide();
	},
	roleItemInit : function(item) {
		if (!item) {
			return;
		}
		var $wrapper = $('#form-res');
		$("#form-res")[0].reset();
		$("input[type='checkbox'][name='resID']").prop("checked",false);
		//此处获取当前用户的授权列表
		$wrapper.spinModal();
		$.ajax({
            type: "POST",
            dataType: "html",
            url: basePath+"/role/findResourceIdListByRoleId",
            data: {id:item.id},
            success: function (data) {
            	var obj=$.parseJSON( data );
            	if(obj.success==true){
            		$wrapper.spinModal(false);
            		$.each(obj.obj,function (i,val){
            			$("#"+val).prop("checked",true);
            		});
            		$("#res_id").val(item.id);
            		$("#res-edit").show().siblings(".info-block").hide();
            	}else{
            		$wrapper.spinModal(false);
            		$.dialog.tips("获取失败",obj.msg);
            	}
            },
            error: function(data) {
            	$wrapper.spinModal(false);
            	$.dialog.tips("获取失败,未知错误！！");
             }
        });
		
	},
	addItemSubmit : function(_table) {
		//检查数据，用户名，密码不能为空
		if($("#name-add").val()=="" ){
			//parent.ha_error("数据错误","请输入角色名！");
			$.dialog.tips("数据错误","请输入角色名！");
			return false;
		}
		
		//parent.ha_load("正在提交数据...");
		$.ajax({
            type: "POST",
            dataType: "html",
            url: basePath+"/role/add",
            data: $('#form-add').serialize(),
            success: function (data) {
            	var obj=$.parseJSON( data );
            	if(obj.success==true){
            		//parent.ha_success("添加成功","用户数据已经添加成功");
            		$.dialog.tips("添加成功,用户数据已经添加成功");
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
            	$.dialog.tips("添加失败,未知错误！！");
             }
        });
	},
	editItemSubmit : function(_table) {
		//parent.ha_load("正在提交数据...");
		$.ajax({
            type: "POST",
            dataType: "html",
            url: basePath+"/role/edit",
            data: $('#form-edit').serialize(),
            success: function (data) {
            	var obj=$.parseJSON( data );
            	if(obj.success==true){
            		//parent.ha_success("修改成功","用户数据已经修改成功");
            		$.dialog.tips("修改成功,用户数据已经修改成功");
            		setTimeout(function(){
            			_table.draw(false);
    				}, 2000);
            	}else{
            		//parent.ha_error("修改失败",obj.msg);
            		$.dialog.tips("修改失败",obj.msg);
            	}
            },
            error: function(data) {
            	//parent.ha_error("修改失败","未知错误！！");
            	$.dialog.tips("修改失败,未知错误！！");
            }
        });
		//$.dialog.tips('保存当前编辑用户');
	},
	editItemResSubmit : function(_table) {//编辑授权页面
		
		var chk_value =[];
		$('input[name="resID"]:checked').each(function(){
			chk_value.push($(this).val());
		});
		
		var id=$("#res_id").val();
		if(chk_value.length==0){
			alert("请至少为该角色授予一个权限！");
			return false;
		}
		var residstr=chk_value.join(",");
		
		$.dialog.tips('正在授权');
		$.ajax({
            dataType: "json",
            url: basePath+"/role/grant",
            data: {id:id,resourceIds:residstr},
            success: function (data) {
            	//parent.ha_success('授权成功','选中的用户授权已完成！');
            	$.dialog.tips('授权成功');
        		setTimeout(function(){
        			_table.draw(true);
				}, 2000);
            },
            error: function(data) {
            	//parent.ha_success('授权失败','网络错误！');
            	$.dialog.tips('授权失败！');
             }
        });
	},
	deleteItem : function(selectedItems,_table) {
		var message;
		if (selectedItems&&selectedItems.length) {
			if (selectedItems.length == 1) {
				message = "确定要删除 '"+selectedItems[0].name+"' 吗?";
				
			}else{
				message = "确定要删除选中的"+selectedItems.length+"项记录吗?";
			}
//			parent.ha_confirm("确定删除",message,function(){
			$.dialog.confirmDanger(message, function(){
				//选中的全部删除
				while(selectedItems.length>0){
					$.ajax({
			            dataType: "json",
			            url: basePath+"/role/delete",
			            data: {id:selectedItems[selectedItems.length-1].id},
			            success: function (data) {
			            	//parent.ha_success('删除成功','选中的用户数据已删除！');
			            	$.dialog.tips('删除成功,选中的用户数据已删除！');
		            		setTimeout(function(){
		            			_table.draw(true);
		            			
		    				}, 2000);
			           	 	
			            },
			            error: function(data) {
			            	//parent.ha_success('删除失败','网络错误！');
			            	$.dialog.tips('删除失败,网络错误！');
			             }
			        });
					selectedItems.length--;
				}
			});
		}else{
			//parent.ha_error('删除失败','请先选中要操作的行');
			$.dialog.tips('请先选中要操作的行');
		}
	}
};