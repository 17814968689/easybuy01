package com.nxy.service.impl;

import com.nxy.entity.EasybuyNews;
import com.nxy.mapper.EasybuyNewsDAO;
import com.nxy.service.EasybuyNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EasybuyNewsServiceImpl implements EasybuyNewsService {
    @Autowired
    private EasybuyNewsDAO easybuyNewsDAO;
    @Override
    public List<EasybuyNews> NewsfindAll() {
        return easybuyNewsDAO.newsfindAll();
    }
}
