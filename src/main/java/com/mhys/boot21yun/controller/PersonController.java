package com.mhys.boot21yun.controller;

import com.mhys.boot21yun.pojo.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PersonController {

    @Resource
    private Person person;

    @RequestMapping("/person")
    public String getPerson(){
        return person.toString();
    }
}
