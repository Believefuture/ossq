/**
 * Created by Administrator on 2014/12/25.
 */
var usernamecode;
submitValid=function(){
  var Email=document.getElementById("Email").value;
    if(Email.length<1||Email==null){
        alert("邮箱不能为空");
        return
    }
    var UserName=document.getElementById("UserName").value;
    ChangeUsername();
    if(usernamecode=="true"){
        alert("用户名已存在");
        return
    }
    if(!ChangePassword()){
        alert("密码不合法");
        return
    }
    if(!Check_Email()){
        alert("邮箱地址格式不正确请重新输入");
        return
    }

    if(!Check_RePassWord()){
        alert("两次密码不唯一");
        return
    }
    var NewUserName=document.getElementById("NewUserName").value;
    if(NewUserName.length<1||NewUserName==null){
        alert("姓名不能为空");
        return
    }
    if(!CheckValidateCode()){
        alert("验证码不能为空");
        return
    }
    var regform =document.getElementById("regform");
    regform.submit();

};
Check_Email=function(){
    var Email=document.getElementById("Email").value;
    var span_CheckEmail=document.getElementById("span_CheckUsername");
    var reg =/^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.(?:com|cn)$/;
    if(reg.test(Email)){
        span_CheckEmail.innerHTML="√";
        return true;
    }
    span_CheckEmail.innerHTML="×";
    return false;
};
ChangePassword=function(){
    var Email=document.getElementById("PassWord").value;
    var span_CheckEmail=document.getElementById("CheckRePassWord");
    var reg =/^([a-zA-Z\d+]{6,16})$/;
    if(reg.test(Email)){
        span_CheckEmail.innerHTML="合法";
        return true;
    }
    span_CheckEmail.innerHTML="密码不合法";
    return false;
};
Check_RePassWord=function(){
    var RexPassWord=document.getElementById("RexPassWord").value;
    var PassWord=document.getElementById("PassWord").value;
    var ReCheckRePassWord=document.getElementById("ReCheckRePassWord");
    if(RexPassWord==PassWord){
        ReCheckRePassWord.innerHTML="合法";
        return true;
    }
    ReCheckRePassWord.innerHTML="两次密码不一致";
    return false;
};
CheckValidateCode=function(){
    var Validate_Code=document.getElementById("Validate_Code").value;
    var CheckValidateCode=document.getElementById("CheckValidateCode");
    if(Validate_Code.length<1||Validate_Code==null){
        CheckValidateCode.innerHTML="验证码不能为空";
        return false;
    }
    return true;
};
ChangeImg1=function(){
    var Img1=document.getElementById("Img1");
    Img1.src="../js/validCode.jsp?"+Math.random();
        return

   };
ChangeUsername=function(){
    var username=document.getElementById("UserName").value;
    var CheckUserName=document.getElementById("CheckUserName");
    if(username.length>1||username!=null){
        $(document).ready(function(){
            $.ajax({
                type : "post",
                url:_path+"/reg/uservalid",
                data : {username:username},
                dataType : "Text",
                success : function(msg){
                    if(msg=="验证成功"){
                        usernamecode="true"
                    }
                    CheckUserName.innerHTML=msg;
//                    $("#span_CheckUsername").text(msg)
                },
                error : function(msg){
                    CheckUserName.innerHTML=msg;
//                    $("#span_CheckUsername").text(msg)
                }
            })

        });
    }
    CheckUserName.innerHTML="用户名不能为空";
    return false;
};

function c(xmlhttp,obj){
    var b = xmlhttp.responseText;
    var CheckUserName=obj;
    if(b=="true"){
        CheckUserName.innerHTML="通过";
        return true;
    }
    CheckUserName.innerHTML="用户名已存在";
    return false;
}

