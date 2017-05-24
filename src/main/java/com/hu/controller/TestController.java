package com.hu.controller;

import com.hu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hu on 2017/5/24.
 */
@RestController
public class TestController {

    @Autowired
    private UserService userService;


    @RequestMapping("/page1")
    public String index(){
        userService.fun();
        return "this is page1";
    }
}
