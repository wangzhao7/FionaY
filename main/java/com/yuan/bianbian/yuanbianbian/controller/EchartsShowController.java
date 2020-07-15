package com.yuan.bianbian.yuanbianbian.controller;

import com.yuan.bianbian.yuanbianbian.data.Echarts;
import org.springframework.context.annotation.Description;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@RestController
public class EchartsShowController
{
    @Description("获取Echarts数据")
    @RequestMapping("/echarsShow")
    @ResponseBody
    public List<Echarts> echartsShow(Model model)
    {
        List<Echarts> list = new ArrayList<>();
        list.add(new Echarts("正极车间",100));
        list.add(new Echarts("负极车间",200));
        list.add(new Echarts("立体仓库",300));
        list.add(new Echarts("清洁车间",400));

        return list;
    }
}
