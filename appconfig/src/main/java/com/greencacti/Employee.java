package com.greencacti;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by baominw on 4/19/17.
 */

/**
 * As with most annotation-based alternatives, keep in mind that the annotation metadata is bound
 * to the class definition itself, while the use of XML allows for multiple beans of the same type
 * to provide variations in their qualifier metadata, because that metadata is provided per-instance
 *rather than per-class.
 */
@Component
@RoleQualifier("Team Leader")
public class Employee {
    @Value("Jarod Zhang")
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
