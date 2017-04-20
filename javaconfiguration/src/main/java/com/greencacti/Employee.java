package com.greencacti;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by baominw on 4/19/17.
 */

public class Employee {

    private String name;

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
