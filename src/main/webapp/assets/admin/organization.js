
/**
* Theme: Moltran Admin Template
* Author: Coderthemes
* Nestable Component
*/

!function($) {
    "use strict";
    var $wrapper = $('#div-table-container');
    var Nestable = function() {};
    //init
    Nestable.prototype.init = function() {
    	$(".info-block").hide();
    	//parent.ha_load("正在努力加载数据....");
    	$wrapper.spinModal();
    	$.ajax({
            dataType: "json",
            type: "POST",
            cache : false,	//禁用缓存
            url: basePath+"/organization/tree",
            success: function (data) {
            	var html="";
            	if(data.length<=0){
            		$("#pname").val('无上级');
            		$("#pid").val(0);
            		$(".info-block").hide();
            		$("#organization-add").show();
            	}
            	$("#organization_list").html(html);
            	html+='<ol class="dd-list">';
            	$.each(data, function(i,val){
            		html+='<li class="dd-item" data-id="'+val.id+'">'+
						'<div class="dd-handle action_list">'+val.text+'<div style="float: right; line-height:170%">'+
						'<button type="button" onclick="addnode('+val.id+',\''+val.text+'\')">'+
						'<i class="fa fa-plus">添加</i>'+
						'</button>'+
						'<button type="button" onclick="editnode('+val.id+',\''+val.text+'\')">'+
						'<i class="fa fa-edit">编辑</i>'+
						'</button>';
            		if(val.children.length<=0){
            			html+='<button type="button" onclick="delnode('+val.id+')">'+
							'<i class="fa fa-trash">删除</i>'+
							'</button>';
            		}
            		html+='</div></div> ';
            		if(val.children.length>0){
            			html+='<ol class="dd-list">';
            			$.each(val.children, function(j,v){
            				html+='<li class="dd-item" data-id="'+v.id+'">'+
	    						'<div class="dd-handle action_list">'+v.text+'<div style="float: right; line-height:170%">'+
	    						'<button type="button" onclick="addnode('+v.id+',\''+v.text+'\')">'+
	    						'<i class="fa fa-plus">添加</i>'+
	    						'</button>'+
	    						'<button type="button" onclick="editnode('+v.id+',\''+v.text+'\')">'+
	    						'<i class="fa fa-edit">编辑</i>'+
	    						'</button>';
	                		if(v.children.length<=0){
	                			html+='<button type="button" onclick="delnode('+v.id+')">'+
	    							'<i class="fa fa-trash">删除</i>'+
	    							'</button>';
	                		}
	                		html+='</div></div> ';
	                		if(v.children.length>0){
	                			html+='<ol class="dd-list">';
	                			$.each(v.children, function(k,v1){
	                				html+='<li class="dd-item" data-id="'+v1.id+'">'+
			    						'<div class="dd-handle">'+v1.text+'<div style="float: right; line-height:170%">'+
			    						'<button type="button" onclick="editnode('+v1.id+',\''+v1.text+'\')">'+
			    						'<i class="fa fa-edit">编辑</i>'+
			    						'</button>';
			                		
			                		html+='<button type="button" onclick="delnode('+v1.id+')">'+
			    						'<i class="fa fa-trash">删除</i>'+
			    						'</button>';
			                		html+='</div></div> ';
	                			});
	                			html+='</ol>';
	                		}
            			});
            			html+='</ol>';
            		}
            	});
            	html+='</ol>';
            	$("#organization_list").html(html);
            	$('#organization_list').nestable();
            	//$('.dd').nestable('collapseAll');
            	//parent.ha_close_load();
            	//关闭遮罩
            	$wrapper.spinModal(false);
            },
            error: function(data) {
            	//parent.ha_close_load();
            	$wrapper.spinModal(false);
             }
        });
    	$(".btn-cancel").click(function(){
    		$(".info-block").hide();
    	});
    },
    //init
    $.Nestable = new Nestable, $.Nestable.Constructor = Nestable
}(window.jQuery),

//initializing 
function($) {
    "use strict";
    $.Nestable.init()
}(window.jQuery);


//添加节点按钮
function addnode(pid,pname){
	$("#pname").val(pname);
	$("#pid").val(pid);
	$(".info-block").hide();
	$("#organization-add").show();
}
//编辑节点按钮
function editnode(id,name){
	$("#edit_id").val(id);
	$("#edit_name").val(name);
	$(".info-block").hide();
	$("#organization-edit").show();
}
//添加节点按钮
$("#btn-save-add").click(function(){
	var $wrapper = $('#div-table-container');
//	parent.ha_load("正在努力添加数据....");
	$wrapper.spinModal();
	$.ajax({
        type: "POST",
        dataType: "html",
        url: basePath+"/organization/add",
        data: $('#form-add').serialize(),
        success: function (data) {
        	setTimeout(function(){
        		$wrapper.spinModal(false);
        		location.reload();
        		$.dialog.tips('添加成功');
        	},1000);
        },
        error: function(data) {
        	$wrapper.spinModal(false);
        	$.dialog.tips("添加失败");
        }
    });
	
});

//编辑节点按钮
$("#btn-save-edit").click(function(){
	var $wrapper = $('#div-table-container');
//	parent.ha_load("正在努力添加数据....");
	$wrapper.spinModal();
	$.ajax({
        type: "POST",
        dataType: "html",
        url: basePath+"/organization/edit",
        data: $('#form-edit').serialize(),
        success: function (data) {
        	setTimeout(function(){
        		$wrapper.spinModal(false);
        		location.reload();
        		$.dialog.tips('编辑成功');
        	},1000);
        },
        error: function(data) {
        	$wrapper.spinModal(false);
        	$.dialog.tips("编辑失败");
         }
    });
	
});

//删除某个节点
function delnode(id){
	var $wrapper = $('#div-table-container');
	var message;
	message = "确定要删除吗?";
	$.dialog.confirmDanger(message, function(){
		$wrapper.spinModal();
		$.ajax({
            dataType: "json",
            url: basePath+"/organization/delete",
            data: {id:id},
            success: function (data) {
            	setTimeout(function(){
            		$wrapper.spinModal(false);
            		location.reload();
            		$.dialog.tips('删除成功');
            	},1000);
            },
            error: function(data) {
            	$wrapper.spinModal(false);
            	$.dialog.tips("删除失败");
             }
        });
	});
}
