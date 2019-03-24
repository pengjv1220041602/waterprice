package com.dd.service.impl;

import com.dd.dao.DetailDao;
import com.dd.service.IDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailServiceImpl implements IDetailService {

    @Autowired
    private DetailDao detailDao;





}
