/**
 * Created by Administrator on 2014/12/25.
 */
submitValid=function(){

    if(!Check_Username()){
        alert("用户名或密码不正确");
        return
    }
    if(!Check_RePassWord()){
        alert("用户名或密码不正确");
        return
    }
    var loginform =document.getElementById("loginform");
    loginform.submit();

};
Check_Username=function(){
    var username=document.getElementById("Username").value;
    var span_CheckEmail=document.getElementById("CheckReUserName");
    span_CheckEmail.innerHTML="用户名格式正确";
    if(username.length<1){
        span_CheckEmail.innerHTML="用户名格式不正确";
        return false;
    }
    return true;
};
Check_pwd=function(){
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
