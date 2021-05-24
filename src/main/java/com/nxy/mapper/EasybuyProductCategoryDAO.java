package com.nxy.mapper;

import com.nxy.entity.EasybuyProduct;
import com.nxy.entity.EasybuyProductCategory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EasybuyProductCategoryDAO继承基类
 */
@Repository
public interface EasybuyProductCategoryDAO extends MyBatisBaseDao<EasybuyProductCategory, Integer> {

    List<EasybuyProductCategory> findBytype();

    List<EasybuyProductCategory> findByid(@Param(value = "id")int id);

}