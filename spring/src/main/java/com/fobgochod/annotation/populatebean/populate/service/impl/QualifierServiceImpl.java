package com.fobgochod.annotation.populatebean.populate.service.impl;

import com.fobgochod.annotation.populatebean.populate.domain.PopulatePojo;
import com.fobgochod.annotation.populatebean.populate.service.PopulateService;
import org.springframework.stereotype.Service;

@Service
public class QualifierServiceImpl implements PopulateService {

    @Override
    public PopulatePojo info(String name) {
        return new PopulatePojo("@" + name + " @Qualifier");
    }
}
