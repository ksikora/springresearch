package com.springapp.mvc.controller;

import com.springapp.mvc.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

     /*autowired poszuka beana odpowiadającego typowi( oraz id musi sie zgadzać !) i tu go wstrzyknie, tak jakbysmy to okreslili w beanie.
    Ciekawe co by bylo jakby bylo kilka beanów o typie Message ?*/
    // id beana musi byc identyczne jak nazwa zmiennej by autowired załapało beana !
    @Autowired
    public Message message;


    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", message.getMessage());
        return "hello";
    }


    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}