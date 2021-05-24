package com.nxy.mapper;

import com.nxy.entity.Result;
import org.springframework.stereotype.Repository;

/**
 * ResultDAO继承基类
 */
@Repository
public interface ResultDAO extends MyBatisBaseDao<Result, Result> {
}