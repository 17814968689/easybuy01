package com.nxy.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nxy.entity.EasybuyNews;
import com.nxy.service.EasybuyNewsService;
import com.nxy.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/news")
public class EasybuyNewsController{
    @Autowired
    private EasybuyNewsService easybuyNewsService;
    @RequestMapping(value = "/newsfindAll")
    public RespBean newsfindAll(@RequestParam(value = "pageNum")Integer pageNum) {
        PageHelper.startPage(pageNum-1,5);
        List<EasybuyNews> newsList = easybuyNewsService.NewsfindAll();
        PageInfo<EasybuyNews> pageInfo=new PageInfo<>(newsList);
       return RespBean.ok("查询成功!",pageInfo);
    }
}