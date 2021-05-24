package com.nxy.controller;

import com.nxy.entity.EasybuyProductCategory;
import com.nxy.service.EasybuyProductCategoryService;
import com.nxy.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Cate")
public class EasybuyProductCategoryController {
    @Autowired
    private EasybuyProductCategoryService easybuyProductCategoryService;
    @RequestMapping(value = "/Category")
    public RespBean fenleiFindAll(){
        List<EasybuyProductCategory> easybuyProductCategories = easybuyProductCategoryService.FindByid();
        if(easybuyProductCategories!=null){
            return  RespBean.ok("成功",easybuyProductCategories);
        }else{
            return RespBean.error("失败");
        }
    }
}
