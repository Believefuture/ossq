package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandisecinfoMapper;
import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.entity.*;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/12/28.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @Resource
    private TmeMerchandiseinfoMapper merchandisedao;

    @Resource
    private TmeMerchandisecinfoMapper merchandisecdao;

    @RequestMapping("in")
    public String in(@ModelAttribute TmeMerchandisecinfo tmemerchandisec, Model model,@RequestParam(value = "page", required = false)Integer page){
        TmeMerchandiseinfoExample merdaoExa=new TmeMerchandiseinfoExample();
        Integer totalpages = new Integer(0);
        List<TmeMerchandiseinfo> merchandiseList=null;
        List<TmeMerchandisecinfo> merchandisecList=null;
        if(tmemerchandisec.getMerchandisecid()==null){
                if(page==null){
                    page=1;
                }
        }else {
                if(page==null){
                    page=1;
                }

            model.addAttribute("tmemerchandisec",tmemerchandisec);
            TmeMerchandiseinfoExample.Criteria cr=merdaoExa.createCriteria();
            cr.andMerchandisecidEqualTo(tmemerchandisec.getMerchandisecid());
        }
        try {
            merdaoExa.setPageIndex(page);
            merdaoExa.setPageSize(8);
            merchandisecList=merchandisecdao.selectAll();
            totalpages=merchandisedao.countByExample(merdaoExa);
            if(totalpages%8>0){
                totalpages=totalpages/8+1;
            }else{
                totalpages=totalpages/8;
            }

            merchandiseList=merchandisedao.selectPage(merdaoExa);
        }catch (Exception e){
            e.printStackTrace();
        }
        model.addAttribute("page",page);
        model.addAttribute("totalpages",totalpages);
        model.addAttribute("merccList",merchandisecList);
        model.addAttribute("merclist",merchandiseList);
        return "index";
    }


}
