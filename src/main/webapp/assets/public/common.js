var iframe = $("#workspace");
function ha_openitem(src){
	
	var iframe = $("#workspace");
	iframe.attr('src',basePath+src);
}

function ha_load(title){
	swal({   
        title: title,   
        imageUrl:basePath+"/assets/images/loading1.gif",
        showConfirmButton: false 
    });
}
function ha_success(title,text){
	swal({
		title: title,   
        text: text, 
        type:"success",
        showConfirmButton: false 
	});
}
function ha_error(title,text){
	swal({
		title: title,   
        text: text, 
        timer: 2000,   
        type:"error",
        showConfirmButton: false 
	});
}


function ha_confirm(title,text,callfun){
	swal({
		title : title,
		text : text,
		type : "warning",
		confirmButtonText:"确定",
		cancelButtonText:"取消",
		showConfirmButton : true,
		showCancelButton : true,
		closeOnConfirm: false,
		showLoaderOnConfirm: true,
	}, function(isConfirm){   
        if (isConfirm) { 
        	callfun();
        }
    });
}
function ha_close_load(){
	swal.close();
}