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
            	data: "i_CAR_ID",//序号
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,//会显示省略号的列，需要用title属性实现划过时显示全部文本的效果
            	width : "80px"
            },
            {
            	className : "ellipsis",	
            	data: "d_TRA_ARR",//日期，前期用到达时间代替
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
            	//固定列宽，但至少留下一个活动列不要固定宽度，让表格自行调整。不要将所有列都指定列宽，否则页面伸缩时所有列都会随之按比例伸缩。
				//切记设置table样式为table-layout:fixed; 否则列宽不会强制为指定宽度，也不会出现省略号。
				width : "150px"			
            },
            {
            	className : "ellipsis",	
            	data: "c_TRA_NUM_ARR",//列车车次
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "80px"			
            },
            {
            	className : "ellipsis",	
            	data: "i_LINE_ID",//股道
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "40px"			
            },
            {
            	className : "ellipsis",	
            	data: "d_TRA_ARR",//到达时间
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
            	//固定列宽，但至少留下一个活动列不要固定宽度，让表格自行调整。不要将所有列都指定列宽，否则页面伸缩时所有列都会随之按比例伸缩。
				//切记设置table样式为table-layout:fixed; 否则列宽不会强制为指定宽度，也不会出现省略号。
				width : "150px"			
            },
            {
            	className : "ellipsis",	
            	data: "c_RANGE_NA",//到发标志，前期用股道代替属性
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "80px"			
            },
           
            {
            	className : "ellipsis",	
            	data: "d_WORK_BEGIN",//作业开始时间
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "150px"			
            },
            {
            	className : "ellipsis",	
            	data: "d_WORK",//作业结束时间
            	render : CONSTANT.DATA_TABLES.RENDER.ELLIPSIS,
				width : "150px"			
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
        	//$('td', row).eq(8).addClass(data.status?"text-success":"text-error");
        	//不使用render，改用jquery文档操作呈现单元格
            var $btnEdit = $('<button type="button" class="btn btn-small btn-primary btn-up">向上</button>');
            var $btnDel = $('<button type="button" class="btn btn-small btn-danger btn-down">向下</button>');
            $('td', row).eq(8).append($btnEdit).append($btnDel);
            
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
		userManage.downItem([item],_table);
		
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
			switch (data.order[0].column) {
			case 1:
				param.sort = "i_CAR_ID";
				break;
			case 2:
				param.sort = "d_TRA_ARR";
				break;
			case 3:
				param.sort = "c_TRA_NUM_ARR";
				break;
			case 4:
				param.sort = "i_LINE_ID";
				break;
			case 5:
				param.sort = "d_WORK_BEGIN";
				break;
			default:
				param.sort = "d_WORK";
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
		$("#i_CAR_ID-view").text(item.i_CAR_ID);
		$("#c_RANGE_NA-view").text(item.c_RANGE_NA);
		
		$("#c_TRA_NUM_ARR-view").text(item.c_TRA_NUM_ARR);
		$("#i_LINE_ID-view").text(item.i_LINE_ID);
		$("#d_TRA_ARR-view1").text(item.d_TRA_ARR);
		$("#d_WORK_BEGIN-view").text(item.d_WORK_BEGIN);
		$("#d_WORK-view").text(item.d_WORK);
	},
	downItem : function(item,table){
		alert("点击了向下的按钮");
	},
	upItem : function(item,table){
		alert("点击了向上的按钮");
	}
};