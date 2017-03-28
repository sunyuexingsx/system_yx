
/**
* 登录控制JS
* 恒爱科技
*/
!function($) {
    "登录表单验证";
    var $wrapper = $('#wapper');
    var FormValidator = function() {
        this.$loginform= $("#loginform");
    };
    
    //init
    FormValidator.prototype.init = function() {
    	$.validator.setDefaults({
            submitHandler: function() { 
            	//ha_load("正在登录中......");
            	$wrapper.spinModal();
            	//此处进行提交处理
            	var formParam = $("#loginform").serialize();//序列化表格内容为字符串  
            	$.ajax({  
            		type:'post',      
            		url:basePath+"/login",  
            		data:formParam,  
            		cache:false,  
            		dataType:'json',  
            		success:function(data){ 
            			if(data.success==true){
            				$wrapper.spinModal(false);
            				$.dialog.tips("登录成功");
            				window.location=basePath+'/index'
            			}else{
            				$.dialog.tips(data.msg);
            			}
            			
            		}  
            	});  
            }
        });
        // validate $loginform
        this.$loginform.validate({
            rules: {
                username: {
                    required: true,
                    minlength: 2
                },
                password: {
                    required: true,
                    minlength: 2
                }
            },
            messages: {
                username: {
                    required: "用户名不能为空",
                    minlength: "用户名不能少于2个字符"
                },
                password: {
                    required: "密码不能为空",
                    minlength: "密码长度不能小于2个字符"
                },
            }
        });
    },
    //init
    $.FormValidator = new FormValidator, $.FormValidator.Constructor = FormValidator
}(window.jQuery),


//initializing 
function($) {
    "登录表单验证";
    $.FormValidator.init()
}(window.jQuery);

//跳出框架在主窗口登录
if(top.location!=this.location)	top.location=this.location;