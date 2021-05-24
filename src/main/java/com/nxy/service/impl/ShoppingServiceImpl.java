package com.nxy.service.impl;

import com.nxy.entity.Shopping;
import com.nxy.mapper.ShoppingDAO;
import com.nxy.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {
    @Autowired
    private ShoppingDAO shoppingDAO;
    @Override
    public int insertShopping(Shopping s) {
        return shoppingDAO.insert(s);
    }

    @Override
    public List<Shopping> FindAll(Integer uid) {
        return shoppingDAO.findAll(uid);
    }

    @Override
    public Shopping id(Integer uid, Integer id) {
        return shoppingDAO.id(uid, id);
    }

    @Override
    public int diejia(Integer uid, Integer id, Integer number) {
        return shoppingDAO.diejia(uid, id, number);
    }

    @Override
    public int delshopping(int gid) {
        return shoppingDAO.deleteByPrimaryKey(gid);
    }
}
