package com.bolsaideas.springboot.app.springbootweb.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping(value = "/index")
    public String index (){
        return "index";
    }
}
