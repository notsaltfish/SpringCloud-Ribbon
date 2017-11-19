package com.chen.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenyong on 2017-11-18.
 */
@RestController
public class ClientController {

    @RequestMapping("/helloWorld")
    public String helloWorld(){
        System.out.println("helloWorld");
        return "HelloWorld";
    }
}
