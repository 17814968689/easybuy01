package com.nxy.mapper;

import com.nxy.entity.EasybuyOrderDetail;
import org.springframework.stereotype.Repository;

/**
 * EasybuyOrderDetailDAO继承基类
 */
@Repository
public interface EasybuyOrderDetailDAO extends MyBatisBaseDao<EasybuyOrderDetail, Integer> {
}