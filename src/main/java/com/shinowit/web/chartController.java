package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2015/1/4.
 */
@Controller
@RequestMapping("/chart")
public class chartController {

    @RequestMapping("in")
    public String cahrtin(){
        return"chart";
    }
}
