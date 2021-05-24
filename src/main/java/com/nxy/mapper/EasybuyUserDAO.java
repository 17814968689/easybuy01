package com.nxy.mapper;

import com.nxy.entity.EasybuyUser;

/**
 * EasybuyUserDAO继承基类
 */
public interface EasybuyUserDAO extends MyBatisBaseDao<EasybuyUser, Integer> {
    EasybuyUser login(String name,String pwd);

    EasybuyUser  findbyid(int id);
}