package com.nxy.service.impl;

import com.nxy.entity.EasybuyUser;
import com.nxy.mapper.EasybuyUserDAO;
import com.nxy.service.EasybuyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EasybuyUserServiceImpl implements EasybuyUserService {

    @Autowired
    private EasybuyUserDAO easybuyUserDAO;

    @Override
    public EasybuyUser login(String name, String pwd) {
        return easybuyUserDAO.login(name,pwd);
    }

    @Override
    public int insertUser(EasybuyUser e){
        return easybuyUserDAO.insert(e);
    }

    @Override
    public EasybuyUser FindById(int id) {
        return easybuyUserDAO.findbyid(id);
    }
}
