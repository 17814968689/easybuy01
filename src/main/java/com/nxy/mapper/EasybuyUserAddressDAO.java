package com.nxy.mapper;

import com.nxy.entity.EasybuyOrder;
import com.nxy.entity.EasybuyUserAddress;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EasybuyUserAddressDAO继承基类
 */
@Repository
public interface EasybuyUserAddressDAO extends MyBatisBaseDao<EasybuyUserAddress, Integer> {

    List<EasybuyOrder> userByid(int userid);
}