package com.greencacti.spring.ioc.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by baominw on 4/19/17.
 */
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Team team = context.getBean("CAM", Team.class);

        System.out.println(team.queryTeamLeader().getName());
    }
}
