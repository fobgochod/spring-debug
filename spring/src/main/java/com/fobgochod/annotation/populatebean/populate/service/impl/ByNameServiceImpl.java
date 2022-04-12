package com.fobgochod.annotation.populatebean.populate.service.impl;

import com.fobgochod.annotation.populatebean.populate.domain.PopulatePojo;
import com.fobgochod.annotation.populatebean.populate.service.populateService;
import org.springframework.stereotype.Service;

@Service
public class ByNameServiceImpl implements populateService {

    @Override
    public PopulatePojo info(String name) {
        return new PopulatePojo("@" + name + " match ByName");
    }
}
