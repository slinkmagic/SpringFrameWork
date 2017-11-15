package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.common.Constant;

@Controller
public class SampleController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String show() {
    	
    	
        return Constant.RequestKey.LOGIN.getKey();
    }
}