package com.greencacti;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by baominw on 4/19/17.
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("production");
        context.register(AppConfig.class);
        context.refresh();

        Team team = context.getBean("CAM", Team.class);

        System.out.println(team.queryTeamLeader().getName());
    }
}
