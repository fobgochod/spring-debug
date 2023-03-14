package com.fobgochod.annotation.configurable.domain;

import com.fobgochod.annotation.configurable.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import java.util.UUID;

@Configurable
public class Account {

    private String id = UUID.randomUUID().toString();

    @Autowired
    private AccountService accountService;

    public String getId() {
        return id;
    }

    public AccountService getAccountService() {
        return accountService;
    }
}
