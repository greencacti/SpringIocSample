package com.greencacti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by baominw on 4/19/17.
 */
public class Team {

    private Employee teamLeader;

    public Team(Employee teamLeader) {
        this.teamLeader = teamLeader;
    }

    public Employee queryTeamLeader() {
        return teamLeader;
    }
}
