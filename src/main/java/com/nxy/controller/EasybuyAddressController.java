package com.nxy.controller;

import com.nxy.entity.EasybuyOrder;
import com.nxy.entity.EasybuyUserAddress;
import com.nxy.service.EasybuyAddressService;
import com.nxy.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class EasybuyAddressController {
    @Autowired
    private EasybuyAddressService easybuyAddressService;
    @RequestMapping(value = "/findbyid",method = RequestMethod.POST)
    public RespBean dizhi(@RequestParam(value = "userid")Integer userid){
        List<EasybuyOrder> order = easybuyAddressService.userByid(userid);
        return  RespBean.ok("查询成功",order);
    }
    @RequestMapping(value = "/addid",method = RequestMethod.POST)
    public RespBean dizhi(EasybuyUserAddress e){
        int addid = easybuyAddressService.addid(e);
        return  RespBean.ok("查询成功",addid);
    }
}
