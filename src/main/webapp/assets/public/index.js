/**
 * 登录控制JS
 * 恒爱科技
 */
$(document).ready(function() {
	var pagestyle = function() {
		var iframe = $("#workspace");
		var h = $(window).height() - iframe.offset().top;
		var w = $(window).width() - iframe.offset().left;
		if (h < 300)
			h = 300;
		if (w < 973)
			w = 973;

		iframe.height(h - 80);
		iframe.width(w);
	}
	pagestyle();
	$(window).resize(pagestyle);
});
function logout() {
	ha_confirm("确定操作","您确定要退出程序吗？",function(){
		$.ajax({  
    		type:'post',      
    		url:basePath+"/logout",  
    		cache:false,  
    		dataType:'json',  
    		success:function(data){ 
    			if(data.success==true){
    				setTimeout(function(){
    					ha_success("退出成功","正在返回登录页面");
    				    window.location=basePath+'/login'
    				  }, 2000);
    			}
    		}  
    	});  
	});
	
}
