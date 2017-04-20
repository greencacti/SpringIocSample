package com.greencacti;

import javax.annotation.PostConstruct;

/**
 * Created by baominw on 4/19/17.
 */
public class Employee {
    private String name;

    @PostConstruct
    public void init(){
        System.out.println(name + " is born.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
