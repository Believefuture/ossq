package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandisecinfoMapper;
import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.entity.TmeMerchandisecinfo;
import com.shinowit.entity.TmeMerchandiseinfo;
import com.shinowit.entity.TmeMerchandiseinfoExample;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2014/12/30.
 */
@Controller
@RequestMapping("/inner")
public class MerchandiseinfoController {
    @Resource
    private TmeMerchandiseinfoMapper merchandisedao;

    @Resource
    private TmeMerchandisecinfoMapper merchandisecdao;

    @RequestMapping("in")
    public String merchandiseinfo(@ModelAttribute TmeMerchandiseinfo tmemerchandise, Model model){
        if(!(null==tmemerchandise.getMerchandiseid())){
            List<TmeMerchandisecinfo> merchandisecList=null;
            try {
                merchandisecList=merchandisecdao.selectAll();
                tmemerchandise = merchandisedao.selectByPrimaryKey(tmemerchandise.getMerchandiseid());
            }catch (Exception e){
                e.printStackTrace();
            }
            model.addAttribute("merccList",merchandisecList);
            model.addAttribute("tmemerchandise",tmemerchandise);
            return"inner";
        }
        return"index";
    }


}


