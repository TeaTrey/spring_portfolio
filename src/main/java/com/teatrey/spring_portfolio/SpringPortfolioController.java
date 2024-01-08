package com.teatrey.spring_portfolio;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController

public class SpringPortfolioController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello.";
    }
    
}
