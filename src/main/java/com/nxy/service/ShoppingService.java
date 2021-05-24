package com.nxy.service;

import com.nxy.entity.Shopping;

import java.util.List;

public interface ShoppingService {

    int insertShopping(Shopping s);

    List<Shopping> FindAll(Integer uid);

    Shopping id(Integer uid ,Integer id);

    int diejia(Integer uid,Integer id,Integer number);

    int delshopping(int gid);

}
