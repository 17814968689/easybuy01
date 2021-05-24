package com.nxy.controller;

import com.nxy.entity.EasybuyProduct;
import com.nxy.entity.EasybuyProductCategory;
import com.nxy.service.EasybuyProductService;
import com.nxy.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/Prod")
public class EasybuyProductController{

    @Autowired
    private EasybuyProductService easybuyProductService;

    @RequestMapping(value = "/Product")
    public RespBean findshangpin(){
        List<EasybuyProductCategory> list = easybuyProductService.find();
        return RespBean.ok("查询成功",list);
    }
    @RequestMapping(value = "/ProductByid")
    public RespBean findByid(@RequestParam(value = "id")int id){
        List<EasybuyProduct> bycategoryLevel1Id = easybuyProductService.findBycategoryLevel1Id(id);
        //System.out.println(bycategoryLevel1Id.toString());
        List<EasybuyProduct> bycategoryLevel2Id = easybuyProductService.findBycategoryLevel2Id(id);
        //第1个是空 第2不是空
        List<EasybuyProduct> bycategoryLevel3Id = easybuyProductService.findBycategoryLevel3Id(id);
        if(CollectionUtils.isEmpty(bycategoryLevel1Id)&&(!(CollectionUtils.isEmpty(bycategoryLevel2Id)))){
            return RespBean.ok("查询成功",bycategoryLevel2Id);
        }else if(CollectionUtils.isEmpty(bycategoryLevel2Id)&&(!(CollectionUtils.isEmpty(bycategoryLevel1Id)))){
            return RespBean.ok("查询成功",bycategoryLevel1Id);
        }else if(CollectionUtils.isEmpty(bycategoryLevel2Id)&&(CollectionUtils.isEmpty(bycategoryLevel1Id))){
           return RespBean.ok("查询成功",bycategoryLevel3Id);
        }
        return RespBean.error("查询失败!",null);
    }
    @RequestMapping(value = "/ProdFindByid")
    public RespBean findAllProd(@RequestParam(value = "id")Integer id){
        List<EasybuyProduct> prodfindAll = easybuyProductService.ProdfindAll(id);
        return RespBean.ok("查询成功",prodfindAll);
    }
    @RequestMapping(value = "/ProdFindByName")
    public RespBean findAllByName(@RequestParam(value = "name")String name){
        List<EasybuyProduct> byName = easybuyProductService.findByName(name);
        return RespBean.ok("查询成功",byName);
    }
}
