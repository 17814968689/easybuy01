package com.nxy.service.impl;

import com.nxy.entity.EasybuyOrder;
import com.nxy.entity.EasybuyUserAddress;
import com.nxy.mapper.EasybuyUserAddressDAO;
import com.nxy.service.EasybuyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EasybuyAddressServiceImpl implements EasybuyAddressService {
    @Autowired
    private EasybuyUserAddressDAO easybuyUserAddressDAO;
    @Override
    public List<EasybuyOrder> userByid(int userid) {
        return easybuyUserAddressDAO.userByid(userid);
    }

    @Override
    public int addid(EasybuyUserAddress e) {
        return easybuyUserAddressDAO.insert(e);
    }
}
