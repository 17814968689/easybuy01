package com.nxy.service.impl;

import com.nxy.entity.EasybuyProductCategory;
import com.nxy.mapper.EasybuyProductCategoryDAO;
import com.nxy.service.EasybuyProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EasybuyProductCategoryServiceImpl implements EasybuyProductCategoryService {
    @Autowired
    private EasybuyProductCategoryDAO easybuyProductCategoryDAO;
    @Override
    public List<EasybuyProductCategory> FindBytype() {
        return easybuyProductCategoryDAO.findBytype();
    }

    @Override
    public List<EasybuyProductCategory> FindByid() {
        List<EasybuyProductCategory> yiji = FindBytype();
        for(EasybuyProductCategory p2:yiji){
            List<EasybuyProductCategory> erji = easybuyProductCategoryDAO.findByid(p2.getId());
            for (EasybuyProductCategory p1:erji) {
                List<EasybuyProductCategory> sanji = easybuyProductCategoryDAO.findByid(p1.getId());
            p1.setChildren(sanji);
            }
            p2.setChildren(erji);
        }
        return yiji;
    }
}
