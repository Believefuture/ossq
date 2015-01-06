package com.shinowit.web;

import com.shinowit.dao.mapper.TbaMemberinfoMapper;
import com.shinowit.entity.TbaMemberinfo;
import com.shinowit.framework.convert.Email.SendHtmlMail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping("/reg")
public class RegController {
    @Resource
    private TbaMemberinfoMapper memdao;

    @Resource
    private SendHtmlMail mail;

    @RequestMapping("reg")
    public String reg() {
        return "reg";
    }

    @RequestMapping("add")
    public String add(TbaMemberinfo user, String Validate_Code, HttpSession session, HttpServletRequest request) {

        List<String> errormsg = new ArrayList<String>();
        boolean valid = false;
        if (null == Validate_Code || !(Validate_Code.equals(session.getAttribute("rand")))) {
            errormsg.add("验证码错误请重新输入");
        }
        if (null == user.getUsername() || user.getUsername().length() < 1) {
            errormsg.add("用户名不能为空");
        }
        if (null == user.getLname() || user.getLname().length() < 1) {
            errormsg.add("性名不能为空");
        }
        if (null == user.getEmail() || user.getEmail().length() < 1) {
            errormsg.add("邮箱不能为空");
        }
        if (null == user.getPwd() || user.getPwd().length() < 1) {
            errormsg.add("密码不合法");
        }
        if (errormsg.size() > 0) {
            request.setAttribute("error", errormsg);
            return "reg";
        }
        try {
            memdao.insert(user);
            valid = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (valid) {
            //这里可以去发邮件！！！！！
            try {
                mail.sendMessage(user.getEmail(),"","");
            } catch (MessagingException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return "redirect:/login/in";
        }
        return "reg";
    }
    @RequestMapping("uservalid")
    public void uservalid(String username,HttpServletResponse response ){
        TbaMemberinfo dd=null;
        try{
            dd=memdao.selectByPrimaryKey(username);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(dd!=null){
            try {
                response.getWriter().println("用户名已存在");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try {
                response.getWriter().println("验证成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
