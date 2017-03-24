package com.mvc.spring.controller;

import com.mvc.spring.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 * Created by Złoty on 2017-03-24.
 */
public class MyController {
    @RequestMapping("/index.htm")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView("index");

        Person p = new Person();
        p.setName("Arek");
        model.addObject("person", p);

        return model;
    }
}
