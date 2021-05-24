package com.nxy.mapper;

import com.nxy.entity.EasybuyProduct;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EasybuyProductDAO继承基类
 */
@Repository
public interface EasybuyProductDAO extends MyBatisBaseDao<EasybuyProduct, Integer> {
        List<EasybuyProduct>  prodfindAll(@Param(value = "id") int id);

        List<EasybuyProduct>  productfindAll(@Param(value = "id") int id);

        List<EasybuyProduct>  productfindAll1(@Param(value = "id") int id);

        List<EasybuyProduct>  productfindAll2(@Param(value = "id") int id);

        List<EasybuyProduct>  findByName(@Param(value = "name")String name);
}