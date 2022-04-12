package com.fobgochod.annotation.populatebean.populate.service.impl;

import com.fobgochod.annotation.populatebean.populate.domain.PopulatePojo;
import com.fobgochod.annotation.populatebean.populate.service.populateService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryServiceImpl implements populateService {

    @Override
    public PopulatePojo info(String name) {
        return new PopulatePojo("@" + name + " @Primary");
    }
}
