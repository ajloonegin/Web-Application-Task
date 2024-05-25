package com.nejat.webapplication2;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class HelloBean {
    @Inject
    private GreetingService greetingService;
    private String name;
    private String greeting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }



    public void doGreeting(){
        greeting=String.format(greetingService.getGreetingTemplate(null),name);
    }
}
