package com.nxy.service;

import com.nxy.entity.EasybuyOrder;
import com.nxy.entity.EasybuyUserAddress;

import java.util.List;

public interface EasybuyAddressService {

    List<EasybuyOrder> userByid(int userid);

    int addid(EasybuyUserAddress e);
}
