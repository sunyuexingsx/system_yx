
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
            		html+='<li class="dd-item dd3-item" data-id="'+val.id+'">'+
	            		'<div class="dd-handle dd3-handle" >'+
						'<input type="checkbox" value="'+val.id+'"  name="resID" id="'+val.id+'" style="float:left;margin-left: -2px;margin-bottom:8px"/>'+
							'</div>'+
						'<div class="dd-handle dd3-content action_list">'+val.text+'</div> ';
            		if(val.children.length>0){
            			html+='<ol class="dd-list">';
            			$.each(val.children, function(j,v){
            				html+='<li class="dd-item dd3-item" data-id="'+v.id+'">'+
            					'<div class="dd-handle dd3-handle" style="overflow:visible">'+
								'<input type="checkbox" value="'+v.id+'"  name="resID" id="'+v.id+'" style="float:left;margin-left: -2px;margin-bottom:8px"/>'+
									'</div>'+
	    						'<div class="dd-handle dd3-content action_list">'+v.text+'</div> ';
	                		if(v.children.length>0){
	                			html+='<ol class="dd-list">';
	                			$.each(v.children, function(k,v1){
	                				html+='<li class="dd-item dd3-item" data-id="'+v1.id+'">'+
		                				'<div class="dd-handle dd3-handle" style="overflow:visible">'+
		        						'<input type="checkbox" value="'+v1.id+'"  name="resID" id="'+v1.id+'"style="float:left;margin-left: -2px;margin-bottom:8px"/>'+
		        							'</div>'+
			    						'<div class="dd-handle dd3-content">'+v1.text+'</div> ';
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
    	
    },
    //init
    $.Nestable = new Nestable, $.Nestable.Constructor = Nestable
}(window.jQuery),
//initializing 
function($) {
    "use strict";
    $.Nestable.init()
}(window.jQuery);

//编辑节点按钮
$("#btn_send_message").click(function(){
	var chk_value =[];
	$('input[name="resID"]:checked').each(function(){
		chk_value.push($(this).val());
	});
	if(chk_value.length==0){
		alert("请至少选择一个部门后再发送！");
		return false;
	}
	var residstr=chk_value.join(",");
	alert("residstr:"+JSON.stringify(residstr));
	var message=$("#message_body").val(residstr);
	alert("message:"+JSON.stringify(message));
	if(message==""){
		alert("请填写内容后再发送！");
		return false;
	}
	$.ajax({
        type: "POST",
        url: basePath+"/message/add",
        dataType: "json",
        data:{"message":residstr},    
        success: function (data) {
        	alert("data:"+JSON.stringify(data));
        },
        error: function(data) {
        	alert("错误");
        }
    });
	
});