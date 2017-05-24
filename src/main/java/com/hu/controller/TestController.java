package com.hu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hu on 2017/5/24.
 */
@RestController
public class TestController {


    @RequestMapping("/page1")
    public String index(){
        return "this is page1";
    }
}
