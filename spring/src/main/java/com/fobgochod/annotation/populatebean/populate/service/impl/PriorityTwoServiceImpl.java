package com.fobgochod.annotation.populatebean.populate.service.impl;

import com.fobgochod.annotation.populatebean.populate.domain.PopulatePojo;
import com.fobgochod.annotation.populatebean.populate.service.PopulateService;
import org.springframework.stereotype.Service;

import javax.annotation.Priority;

@Priority(2)
@Service
public class PriorityTwoServiceImpl implements PopulateService {

    @Override
    public PopulatePojo info(String name) {
        return new PopulatePojo("@" + name + " @Priority(2)");
    }
}
