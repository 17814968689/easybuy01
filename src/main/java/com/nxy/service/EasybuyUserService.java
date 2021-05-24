package com.nxy.service;

import com.nxy.entity.EasybuyUser;

public interface EasybuyUserService {

    EasybuyUser login(String name,String pwd);

    int  insertUser(EasybuyUser e);

    EasybuyUser FindById(int id);
}
