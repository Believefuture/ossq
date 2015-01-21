package com.shinowit.web;

import com.shinowit.dao.mapper.ChartMapper;
import com.shinowit.dao.mapper.TmeMerchandisecinfoMapper;
import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.entity.Chart;
import com.shinowit.entity.TbaMemberinfo;
import com.shinowit.entity.TmeMerchandisecinfo;
import com.shinowit.entity.TmeMerchandiseinfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @Resource
    private ChartMapper chartmapper;

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
    @RequestMapping("ind")
    public String addmerchandiseinfo(@ModelAttribute TmeMerchandiseinfo tmemerchandise, Model model,HttpSession session){
        if(!(null==tmemerchandise.getMerchandiseid())){
            if((null==session.getAttribute("user"))){
                return "redirect:/login/in?merchandiseid="+tmemerchandise.getMerchandiseid();
            }
            List<TmeMerchandisecinfo> merchandisecList=null;
            TbaMemberinfo dd=( TbaMemberinfo) session.getAttribute("user");
            Chart chart=new Chart();
            try {
                merchandisecList=merchandisecdao.selectAll();
                tmemerchandise = merchandisedao.selectByPrimaryKey(tmemerchandise.getMerchandiseid());
                chart.setMerchandiseid(tmemerchandise.getMerchandiseid());
                chart.setMerchandisename(tmemerchandise.getMerchandisename());
                chart.setNum(1);
                chart.setUsername(dd.getUsername());
                chart.setPice(tmemerchandise.getPrice());
                chartmapper.insert(chart);

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


