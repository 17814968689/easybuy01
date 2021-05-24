package com.nxy.controller;

import com.nxy.entity.EasybuyUser;
import com.nxy.service.EasybuyUserService;
import com.nxy.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
/*@CrossOrigin*/
public class EasybuyUserController {
    @Autowired
    private EasybuyUserService easybuyUserService;

    @RequestMapping(value = "/userlogin")
    public RespBean Userlogin(@RequestParam(name = "name") String name,
                               @RequestParam(name = "pwd")String pwd) {
        EasybuyUser username = easybuyUserService.login(name, pwd);
        if (username!=null) {
            return RespBean.ok("登录成功",username);
        } else {
            return RespBean.error("登录失败");
        }
    }
    @RequestMapping(value = "/userzhuce")
    public RespBean Userzhuce(@RequestBody EasybuyUser easybuyUser){
        int add= easybuyUserService.insertUser(easybuyUser);
            return  RespBean.ok("添加成功",add);
    }
    @RequestMapping(value = "/findbyid",method = RequestMethod.POST)
    public RespBean Userzhuce(@RequestParam(value = "id")Integer id){
        EasybuyUser user = easybuyUserService.FindById(id);
        return  RespBean.ok("查询成功",user);
    }
}
