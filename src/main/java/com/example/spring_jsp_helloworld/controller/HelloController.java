package com.example.spring_jsp_helloworld.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

    @GetMapping({"/","/hello"})
    public ModelAndView hello(@RequestParam(value = "name",defaultValue = "World",required = true)String name){
        ModelAndView mv=new ModelAndView();
        mv.addObject("name",name);
        mv.setViewName("Welcome");
        return mv;
    }
}
