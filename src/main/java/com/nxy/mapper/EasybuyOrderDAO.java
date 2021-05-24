package com.nxy.mapper;

import com.nxy.entity.EasybuyOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EasybuyOrderDAO继承基类
 */
@Repository
public interface EasybuyOrderDAO extends MyBatisBaseDao<EasybuyOrder, Integer> {

    List<EasybuyOrder> userByid(int userid);
}