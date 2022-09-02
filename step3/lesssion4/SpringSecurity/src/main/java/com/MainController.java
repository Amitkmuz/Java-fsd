package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "welcome !";
    }

    @RequestMapping("/protected")
    public String protectedHello(){
        return "Hello User";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Hello World from admin";
    }
}

