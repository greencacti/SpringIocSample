package com.greencacti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by baominw on 4/19/17.
 */
@Component("CAM")
public class Team {
    @Autowired
    @RoleQualifier("Team Leader")
    private Employee teamLeader;

    public Employee queryTeamLeader() {
        return teamLeader;
    }
}
