package com.nxy.mapper;

import com.nxy.entity.EasybuyNews;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EasybuyNewsDAO继承基类
 */
@Repository
public interface EasybuyNewsDAO extends MyBatisBaseDao<EasybuyNews, Integer> {
    List<EasybuyNews> newsfindAll();
}