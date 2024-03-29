package com.fobgochod.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class MyHttpStatusException extends RuntimeException {

    private static final long serialVersionUID = -7876639844077632100L;

}
