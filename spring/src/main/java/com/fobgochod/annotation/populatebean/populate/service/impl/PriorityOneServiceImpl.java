package com.fobgochod.annotation.populatebean.populate.service.impl;

import com.fobgochod.annotation.populatebean.populate.domain.PopulatePojo;
import com.fobgochod.annotation.populatebean.populate.service.populateService;
import org.springframework.stereotype.Service;

import javax.annotation.Priority;

@Priority(1)
@Service
public class PriorityOneServiceImpl implements populateService {

    @Override
    public PopulatePojo info(String name) {
        return new PopulatePojo("@" + name + " @Priority(1)");
    }
}
