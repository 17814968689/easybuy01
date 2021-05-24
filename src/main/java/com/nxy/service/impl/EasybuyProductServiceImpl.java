package com.nxy.service.impl;

import com.nxy.entity.EasybuyProduct;
import com.nxy.entity.EasybuyProductCategory;
import com.nxy.mapper.EasybuyProductCategoryDAO;
import com.nxy.mapper.EasybuyProductDAO;
import com.nxy.service.EasybuyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EasybuyProductServiceImpl implements EasybuyProductService {
    @Autowired
    private EasybuyProductDAO easybuyProductDAO;
    @Autowired
    private EasybuyProductCategoryDAO easybuyProductCategoryDAO;

    @Override
    public List<EasybuyProductCategory> find() {
        List<EasybuyProductCategory> yiji = easybuyProductCategoryDAO.findBytype();
        for (EasybuyProductCategory p:yiji) {
            List<EasybuyProduct> shangping = easybuyProductDAO.productfindAll(p.getId());
            List<EasybuyProductCategory> erji= easybuyProductCategoryDAO.findByid(p.getId());
            p.setChildren(erji);
            p.setList(shangping);
        }
       return yiji;
    }

    @Override
    public List<EasybuyProduct> findBycategoryLevel1Id(int id) {
        return easybuyProductDAO.productfindAll(id);
    }

    @Override
    public List<EasybuyProduct> findBycategoryLevel2Id(int id) {
        return easybuyProductDAO.productfindAll1(id);
    }

    @Override
    public List<EasybuyProduct> findBycategoryLevel3Id(int id) {
        return easybuyProductDAO.productfindAll2(id);
    }

    @Override
    public List<EasybuyProduct> ProdfindAll(int id) {
        return easybuyProductDAO.prodfindAll(id);
    }

    @Override
    public List<EasybuyProduct> findByName(String name) {
        return easybuyProductDAO.findByName(name);
    }
}
