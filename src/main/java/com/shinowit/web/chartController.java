package com.shinowit.web;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shinowit.dao.mapper.ChartMapper;
import com.shinowit.entity.Chart;
import com.shinowit.entity.ChartExample;
import com.shinowit.entity.TbaMemberinfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2015/1/4.
 */
@Controller
@RequestMapping("/chart")
public class chartController {

    @Resource
    private ChartMapper chartdao;

    @Resource
    private ChartMapper chartmapper;

    @RequestMapping("in")
    public String cahrtin(HttpSession session, Model model){
        if((null==session.getAttribute("user"))){
           return "redirect:/login/in";
        }
        List<Chart> chartlist=null;
        TbaMemberinfo dd=( TbaMemberinfo) session.getAttribute("user");
        try {
            chartlist=chartmapper.selectUsername(dd.getUsername());
        }catch (Exception e){
            e.printStackTrace();
        }
        model.addAttribute("chartlist",chartlist);
        return"chart";
    }
    @RequestMapping("/delete")
    public String deletechart(@RequestParam("chartid") Integer chartid){
        int a = chartdao.deleteByPrimaryKey(chartid);
        return "redirect:/chart/in";
    }
    @RequestMapping("/deleteall")
    public void deleteaa(String jsonData,HttpServletResponse response){
        try {
            ObjectMapper objectMapper = new  ObjectMapper();
            List<Chart> chartList= objectMapper.readValue(jsonData, new TypeReference<List<Chart>>(){});
            int a = 0;
            for (Chart chart:chartList){
                a = chartdao.deleteByPrimaryKey(chart.getId());
            }
            if(a>0){
                response.getWriter().println("删除成功");
            }else{
                response.getWriter().println("删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
