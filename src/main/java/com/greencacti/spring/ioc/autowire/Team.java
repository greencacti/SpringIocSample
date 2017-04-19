package com.greencacti.spring.ioc.autowire;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by baominw on 4/19/17.
 */
public class Team {
    @Autowired
    @RoleQualifier("Team Leader")
    private Employee teamLeader;

    public Employee queryTeamLeader() {
        return teamLeader;
    }
}
