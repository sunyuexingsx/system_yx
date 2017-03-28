$(function (){
	var $wrapper = $('#div-table-container');
	var $table = $('#table-user');
	$(".form_datetime").datetimepicker({
		format: 'yyyy-mm-dd hh:ii',
		language:'zh-CN',
		autoclose: true,
		minuteStep:10
	});
	var _table = $table.dataTable($.extend(true,{},CONSTANT.DATA_TABLES.DEFAULT_OPTION, {
		ajax : function(data, callback, settings) {//ajax配置为function,手动调用异步查询
			//手动控制遮罩

			$wrapper.spinModal();
			//parent.ha_load("正在努力加载数据....");


			//封装请求参数
			var param =userManage.getQueryCondition(data);
			$.ajax({
		            type: "POST",
		            url: basePath+"/qcwork/listData",
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
		            }
		        });
		},
        columns: [
            
            {
            	className : "ellipsis",	//文字过长时用省略号显示，CSS实现
            	data: "iTraId",//序号
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,//会显示省略号的列，需要用title属性实现划过时显示全部文本的效果
            	width : "70px"
            },
            {
            	className : "ellipsis",	
            	data: "cTraNum",//列车车次
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
            	//固定列宽，但至少留下一个活动列不要固定宽度，让表格自行调整。不要将所有列都指定列宽，否则页面伸缩时所有列都会随之按比例伸缩。
				//切记设置table样式为table-layout:fixed; 否则列宽不会强制为指定宽度，也不会出现省略号。
				width : "50px"			
            },
            {
            	className : "ellipsis",	
            	data: "iLineIdArrdep",//到发股道
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "50px"			
            },
            {
            	className : "ellipsis",	
            	data: "dFaNotify",//实际报点时间
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "140px"			
            },
            {
            	className : "ellipsis",	
            	data: "eSymArrdep",//到发
            	render : function(data,type, row, meta) {
					return ((data==7)?"终到":"始发");
				},
            	//固定列宽，但至少留下一个活动列不要固定宽度，让表格自行调整。不要将所有列都指定列宽，否则页面伸缩时所有列都会随之按比例伸缩。
				//切记设置table样式为table-layout:fixed; 否则列宽不会强制为指定宽度，也不会出现省略号。
				width : "60px"			
            },
            {
            	className : "ellipsis",	
            	data: "ePlState",//计划状态
            	render : function(data,type, row, meta) {
            		var type;
            		switch(data){
	            		case 0:
	            			type='排队';
	            			break;
	            		case 1:
	            			type='等待';
	            			break;
	            		case 2:
	            			type='开始';
	            			break;
            		}
					return (type);
				},
            	//固定列宽，但至少留下一个活动列不要固定宽度，让表格自行调整。不要将所有列都指定列宽，否则页面伸缩时所有列都会随之按比例伸缩。
				//切记设置table样式为table-layout:fixed; 否则列宽不会强制为指定宽度，也不会出现省略号。
				width : "80px"			
            },
            {
            	className : "ellipsis",	
            	data: "qcworkUserName",//作业人员
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "80px"			
            },
            {
            	className : "ellipsis",	
            	data: "qcworkBegintime",//作业开始时间
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "140px"			
            },
            {
            	className : "ellipsis",	
            	data: "qcworkEndtime",//作业结束时间
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "140px"			
            },
            
            {
            	className : "ellipsis",	
            	data: "qcworkStatus",//作业状态
            	render : function(data,type, row, meta) {
            		var html='<i class="fa fa-cog"></i>';
            		if(data==2){
            			html+='已检';
            		}else if(data==1){
            			html+='巡检';
            		}else{
            			html+='待检';
            		}
					return html;
				},
				width : "80px"			
            },
            
			{
				className : "td-operation",
				data: null,
				defaultContent:"",
				orderable : false,
				
			}
        ],
        "createdRow": function ( row, data, index ) {
        	//行渲染回调,在这里可以对该行dom元素进行任何操作
        	//给当前行加样式
        	if (data.role) {
        		$(row).addClass("info");
			}
        	//给当前行某列加样式
        	var rowClass='';
        	if(data.qcworkStatus==2){
        		rowClass="text-success";
        	}else if(data.qcworkStatus==1){
        		rowClass="text-pink";
        	}else{
        		rowClass="text-error";
        	}
        	$('td', row).eq(9).addClass(rowClass);
        	//不使用render，改用jquery文档操作呈现单元格
            var $btnEdit = $('<button type="button"><i class="icon-arrow-up btn-up"></i></button>');
            var $btnDel = $('<button type="button"><i class="icon-arrow-down  btn-down"></i></button>');
            $('td', row).eq(10).append($btnEdit).append($btnDel);
            
        },
        "drawCallback": function( settings ) {
        	//渲染完毕后的回调
        	
        	//默认选中第一行
        	$("tbody tr",$table).eq(0).click();
        }
	})).api();//此处需调用api()方法,否则返回的是JQuery对象而不是DataTables的API对象

	
	
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
	
	//行点击事件
	$("tbody",$table).on("click","tr",function(event) {
		$(this).addClass("active").siblings().removeClass("active");
		//获取该行对应的数据
		var item = _table.row($(this).closest('tr')).data();
		userManage.currentItem = item;
		userManage.showItemDetail(item);
    });
	
	$table.on("click",".btn-up",function() {
    	//点击向上按钮
        var item = _table.row($(this).closest('tr')).data();
		$(this).closest('tr').addClass("active").siblings().removeClass("active");
		userManage.upItem(item,_table);
	}).on("click",".btn-down",function() {
		//点击向下按钮
		var item = _table.row($(this).closest('tr')).data();
		$(this).closest('tr').addClass("active").siblings().removeClass("active");
		userManage.downItem(item,_table);
		
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
});

var userManage = {
	currentItem : null,
	fuzzySearch : true,
	getQueryCondition : function(data) {
		var param = {};
		//组装排序参数
		if (data.order&&data.order.length&&data.order[0]) {
			//alert(data.order[0].column);
			switch (data.order[0].column) {
			case 0:
				param.sort = "I_TRA_ID";
				break;
			case 1:
				param.sort = "C_TRA_NUM";
				break;
			case 2:
				param.sort = "I_LINE_ID_ARRDEP";
				break;
			case 3:
				param.sort = "D_FA_NOTIFY";
				break;
			case 4:
				param.sort = "E_SYM_ARRDEP";
				break;
			case 5:
				param.sort = "E_PL_STATE";
				break;
			case 6:
				param.sort = "QCWORK_BEGINTIME";
				break;
			case 7:
				param.sort = "QCWORK_ENDTIME";
				break;
			case 8:
				param.sort = "QCWORK_STATUS";
				break;
			default:
				param.sort = "E_PL_STATE";
				break;
			}
			param.order = data.order[0].dir;
		}
		//组装查询参数
		param.fuzzySearch = userManage.fuzzySearch;
		if (userManage.fuzzySearch) {
			param.cTraNum = $("#fuzzy-search").val();
		}else{
			param.iLineIdArrdep = $("#iLineIdArrdep-search").val();
			param.eSymArrdep = $("#eSymArrdep-search").val();
			param.dFaNotify_begin = $("#dFaNotify_begin-search").val();
			param.dFaNotify_end = $("#dFaNotify_end-search").val();
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
		$("#iTraId-view").text(item.iTraId);
		$("#cTraNum-view").text(item.cTraNum);
		$("#iLineIdArrdep-view").text(item.iLineIdArrdep);
		$("#dFaNotify-view").text(item.dFaNotify);
		$("#eSymArrdep-view").text((item.eSymArrdep==7)?"终到":"始发");
		var type;
		switch(item.ePlState){
    		case 0:
    			type='排队';
    			break;
    		case 1:
    			type='等待';
    			break;
    		case 2:
    			type='开始';
    			break;
		}
		$("#ePlState-view").text(type);
		$("#qcworkBegintime-view").text(item.qcworkBegintime);
		$("#qcworkEndtime-view").text(item.qcworkEndtime);
		$("#qcworkStatus-view").text(item.qcworkStatus?"已检":"待检");
	},
	downItem : function(item,table){
		parent.ha_load("正在提交数据...");
		$.ajax({
            type: "POST",
            dataType: "html",
            url: basePath+"/qcwork/sortUp",
            data: {iTraId:item.iTraId,type:2},
            success: function (data) {
            	var obj=$.parseJSON( data );
            	if(obj.success==true){
            		parent.ha_success("修改成功","数据已经修改成功");
            		setTimeout(function(){
            			table.ajax.reload();
            			//parent.ha_close_load();
    				}, 1000);
            	}else{
            		parent.ha_error("修改失败",obj.msg);
            	}
            },
            error: function(data) {
            	parent.ha_error("修改失败","未知错误！！");
             }
        });
	},
	upItem : function(item,table){
		
		parent.ha_load("正在提交数据...");
		var newSeq=item.qcworkSeq-1;
		if (newSeq<1)
			newSeq=1;
		$.ajax({
            type: "POST",
            dataType: "html",
            url: basePath+"/qcwork/sortUp",
            data: {iTraId:item.iTraId,type:1},
            success: function (data) {
            	var obj=$.parseJSON( data );
            	if(obj.success==true){
            		parent.ha_success("修改成功","数据已经修改成功");
            		setTimeout(function(){
            			table.ajax.reload();
            			//parent.ha_close_load();
    				}, 1000);
            	}else{
            		parent.ha_error("修改失败",obj.msg);
            	}
            },
            error: function(data) {
            	parent.ha_error("修改失败","未知错误！！");
             }
        });
	}
};