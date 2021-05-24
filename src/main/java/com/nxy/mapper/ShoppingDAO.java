package com.nxy.mapper;

import com.nxy.entity.Shopping;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ShoppingDAO继承基类
 */
@Repository
public interface ShoppingDAO extends MyBatisBaseDao<Shopping, Integer> {

            List<Shopping> findAll(Integer uid);

            Shopping id(Integer uid ,Integer id);

            int diejia(Integer uid,Integer id,Integer number);

}