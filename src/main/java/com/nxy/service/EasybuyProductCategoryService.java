package com.nxy.service;

import com.nxy.entity.EasybuyProductCategory;

import java.util.List;

public interface EasybuyProductCategoryService {

    List<EasybuyProductCategory> FindBytype();

    List<EasybuyProductCategory> FindByid();



}
