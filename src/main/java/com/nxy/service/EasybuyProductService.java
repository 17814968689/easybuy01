package com.nxy.service;

import com.nxy.entity.EasybuyProduct;
import com.nxy.entity.EasybuyProductCategory;

import java.util.List;

public interface EasybuyProductService {

    List<EasybuyProductCategory> find();

    List<EasybuyProduct>  findBycategoryLevel1Id(int id);

    List<EasybuyProduct>  findBycategoryLevel2Id(int id);

    List<EasybuyProduct>  findBycategoryLevel3Id(int id);

    List<EasybuyProduct>  ProdfindAll(int id);

    List<EasybuyProduct>  findByName(String name);
}
