/**
 * Created by Administrator on 2015/1/19.
 */
var Product=function(code,num,price,img,totalmoney,merchanname){
    this.chartid=code;
    this.num=num;
    this.price=price;
    this.picth = img;
    this.totalmoney = totalmoney;
    this.merchandisename = merchanname;
};

$(document).ready(function(){
//    $("#tiaojian1").click(function(){
//        var newpageindex = parseInt(pageindex)+1;
//        var newpagesum = parseInt(pagesumnum);
//        $("#tiaojian1").css("background","green");
//        if(newpageindex>newpagesum){
//            alert("已经是最后一页了！");
//            return;
//        }
//        window.location.href = "/shinowit/chart?pageindex="+newpageindex+"&merchanname="+$("#unique4").text();
//    });
//
//    $("#tiaojian2").click(function(){
//        var newpageindex = parseInt(pageindex)-1;
//
//        if(newpageindex==0){
//            alert("已经是第一页了！");
//            return;
//        }
//        window.location.href = "/shinowit/chart?pageindex="+newpageindex+"&merchanname="+$("#unique4").text();
//    });
////分页的变换样式
//    $("#tiaojian1").mousedown(function(){
//        $("#tiaojian1").css("background","green");
//    });
//    $("#tiaojian1").mouseup(function(){
//        $("#tiaojian1").css("background","yellowgreen");
//    });
//    $("#tiaojian2").mousedown(function(){
//        $("#tiaojian2").css("background","green");
//    });
//    $("#tiaojian2").mouseup(function(){
//        $("#tiaojian2").css("background","yellowgreen");
//    });
//    $("#pageto").click(function(){
//        var pageindex = $("#inputpageto").val();
//        var newpagesum = parseInt(pagesumnum);
//        if(pageindex<1){
//            alert("输入值不合法！");
//            return;
//        }
//        if(pageindex>newpagesum){
//            alert("输入值超出了总的也数！");
//            return;
//        }
//        window.location.href = "/shinowit/chart?pageindex="+pageindex+"&merchanname="+$("#unique4").text();
//    });


//全选框事件
    function selectall(){
        $("input[type=checkbox]").prop("checked","checked");
    }
    function selectnone(){
        $("input[type=checkbox]").removeAttr("checked");
    }
    function selectall(){
        $("input[type=checkbox]").prop("checked","checked");
    }
    function selectnone(){
        $("input[type=checkbox]").removeAttr("checked");
    }
    $("#firstcheckboxid").change(function(){
        var aa = $(this).is(':checked');
        if(aa){
            selectall();
            var total_money=0;
            var totalmoney=0;
//            var num = 0;
            $('#uniquetrid input[type=checkbox]').each(function(){
//                totalmoney =  $(this).parent().prevAll().eq(3).children().text();
                totalmoney=$(this).parent().prevAll().eq(1).children().text();
//                num=$(this).parent().prevAll().eq(2).children().val();
                total_money=total_money+Number(totalmoney);
            });
            $("#spRealTotalAmount").text(total_money);
        }else{
            selectnone();
            $("#spRealTotalAmount").text("0.00");
        }
    });
//多条删除
   function DeleteProduct(id){
       var totalidarry =new Array();
       var product=new Product(id);
       totalidarry.push(product);
       var content1 = $.toJSON(totalidarry);
       $.ajax({
           type : "POST",
           url : _path+"/chart1/deleteall",
           data : {jsonData:content1},
           contendType:"application/json",
           success : function(msg){
               alert(msg);
               window.location = _path+"/shinowit/chart"
           },
           error : function(msg){
               alert(msg);
           }
       })
   }

    $("#jl02").click(function(){
        var totalidarry =new Array();
        $('#shoppingCatTable input[type=checkbox]:checked').each(function(i){
            var code=parseInt($(this).attr('newid'));
            if (isNaN(code)==true){
                return true;
            }
            var product=new Product(code);
            totalidarry.push(product);
        });
        var content1 = $.toJSON(totalidarry);
        $.ajax({
            type : "POST",
            url : _path+"/shinowit/deleteall",
            data : {jsonData:content1},
            contendType:"application/json",
            success : function(msg){
                alert(msg);
                window.location = _path+"/shinowit/chart"
            },
            error : function(msg){
                alert(msg);
            }
        })
    });
});
//当点击checkbox的时候改变金额
function singlecheck(id){
    var total_money=0;
    $('#shoppingCatTable input[type=checkbox]:checked').each(function(){
        total_money=total_money+parseFloat($(this).attr('money'));
    });
    $("#spRealTotalAmount").text(total_money);
}
//点击减数量
function mousedown(id){
    $("#OrderAmount_2"+id).val(parseInt($("#OrderAmount_2"+id).val())-1);
    $("#jianid"+id).css("background","gray");
    $("#jianid"+id).mouseup(function(){
        $("#jianid"+id).css("background","lightgrey")
    });
    if(parseInt($("#OrderAmount_2"+id).val())<1){
        parseInt($("#OrderAmount_2"+id).val(1))
    }
}
//点击加数量
function mousedown1(id){
    $("#OrderAmount_2"+id).val(parseInt($("#OrderAmount_2"+id).val())+1);
    $("#numaddid"+id).css("background","gray");
    $("#numaddid"+id).mouseup(function(){
        $("#numaddid"+id).css("background","lightgrey")
    })
}
function inputblur(id){
    if(parseInt($("#OrderAmount_2"+id).val())<1){
        parseInt($("#OrderAmount_2"+id).val(1))
    }
};

//更改数量
function EditProductCount(id,index){
    var totalmoney =Number($("#"+id+1).text());
    var num=Number(index.value);
    $("#"+id+2).html(totalmoney*num);
};



//将数据加入到session中
function imgclick(id){
    var productxinxi = new Array();
    $('#shoppingCatTable input[type=checkbox]:checked').each(function(){
        var code = parseInt($(this).attr('newid'));
        var merchanname = ($(this).attr('merchanname'));
        var price = ($(this).attr('money'));
        var totalmoney = ($("#totalmponey")).attr("data");
        var num = $('#shoppingCatTable input[type="text"]').val();
        var img = $(this).attr('img');
        if(isNaN(code)==true){
            return true;
        }
        var product = new Product(code,num,price,img,totalmoney,merchanname);
        productxinxi.push(product);
    });
    var content = $.toJSON(productxinxi);
    $.ajax({
        type : "POST",
        url : _path+"/shinowit/session",
        data : {jsonData:content},
        contendType : "application/json"
    })
}