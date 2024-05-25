package com.nejat.webapplication2;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    @PostConstruct
    public void init(){
        //..
    }
    public String getGreetingTemplate(String language){
        String result="Hello %s";

        return result;
    }
}
