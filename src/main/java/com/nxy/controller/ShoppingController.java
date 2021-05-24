package com.nxy.controller;

import com.nxy.entity.Shopping;
import com.nxy.service.ShoppingService;
import com.nxy.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/shop")
public class ShoppingController{
    @Autowired
    private ShoppingService shoppingService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public RespBean addShopping(Shopping s){
        Shopping id = shoppingService.id(s.getUid(), s.getId());
        if (id!=null){
            shoppingService.diejia(s.getUid(), s.getId(),id.getNumber()+s.getNumber());
            return RespBean.ok("添加成功");
        }else{
            if(s.getUid()!=null){
                shoppingService.insertShopping(s);
                return RespBean.ok("加入购物车成功");
            }else{
                return RespBean.error("请先登录");
            }
        }
        //int i = shoppingService.insertShopping(s);
        //return RespBean.ok("添加成功",i);
    }
    @RequestMapping(value = "/find",method = RequestMethod.POST)
    public RespBean findAll(@RequestParam(value = "uid")Integer uid){
        List<Shopping> shoppings = shoppingService.FindAll(uid);
        return RespBean.ok("查询成功",shoppings);
    }
    @RequestMapping(value = "/del",method = RequestMethod.DELETE)
    public RespBean delId(@RequestParam(value = "gid")Integer gid){
        int delshopping = shoppingService.delshopping(gid);
        return RespBean.ok("删除成功",delshopping);
    }
}
