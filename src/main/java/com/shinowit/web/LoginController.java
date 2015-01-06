package com.shinowit.web;

import com.shinowit.dao.mapper.TbaMemberinfoMapper;
import com.shinowit.entity.TbaMemberinfo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Resource
    private TbaMemberinfoMapper memdao;

    @RequestMapping("in")
    public String in(@ModelAttribute("user") TbaMemberinfo userInfo){
        return "login";
    }

    @RequestMapping("login")
    public String login(@Valid @ModelAttribute("user") TbaMemberinfo userInfo,BindingResult bindingResult,HttpServletRequest request){
        if (bindingResult.hasErrors()) {
            return "login";
        }
        TbaMemberinfo dd=null;
        try{
             dd=memdao.selectByPrimaryKey(userInfo.getUsername());
        }catch(Exception e){
            e.printStackTrace();
        }

        if(dd!=null){
            if(dd.getPwd().equals(userInfo.getPwd())){
                return "index";
            }else {
                String errormsg ="用户名或密码错误";
                request.setAttribute("error",errormsg);
            }
        }
        String errormsg ="用户名或密码错误";
        request.setAttribute("error",errormsg);
        return "login";
    }

}
