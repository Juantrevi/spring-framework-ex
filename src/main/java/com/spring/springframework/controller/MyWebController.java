package com.spring.springframework.controller;

import com.spring.springframework.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {

    @Autowired
    private BusinessService businessService;
    public long returnValueFromBusinessService(){
        return businessService.calculateSum();
    }
}


