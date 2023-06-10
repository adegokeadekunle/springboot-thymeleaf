package com.adekunle.spring_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message","Hello World Thymeleaf !!!!");
        return "hello-world";
    }
    @GetMapping("/style")
    public String style(){
        return "adding-css-js-demo";
    }

    @GetMapping("/bootstrap")
    public String bootstrap(){
        return "add-bootstrap";
    }

}
