package com.greencacti;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by baominw on 4/19/17.
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        Team team = context.getBean("CAM", Team.class);

        System.out.println(team.queryTeamLeader().getName());
    }
}
