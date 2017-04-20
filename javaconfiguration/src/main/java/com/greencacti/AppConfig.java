package com.greencacti;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;

/**
 * Created by baominw on 4/20/17.
 */
@Configuration
@ComponentScan(basePackages = "com.greencacti")
public class AppConfig {

    @Bean(name = "teamLeader", initMethod = "init")
    @Scope(scopeName = "singleton")
    public Employee teamLeader() {
        Employee employee = new Employee();
        employee.setName("Jarod Zhang");
        return employee;
    }

    @Bean(name = "cam")
    @Description("CAM Team")
    public Team cam(Employee teamLeader) {
        Team team = new Team(teamLeader);
        return team;
    }
}
