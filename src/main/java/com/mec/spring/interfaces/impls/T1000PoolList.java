package com.mec.spring.interfaces.impls;

import com.mec.spring.interfaces.Robot;
import com.mec.spring.interfaces.RobotPoolList;

import java.util.Collection;

public class T1000PoolList implements RobotPoolList {

    Collection<Robot> robotCollection;

    @Override
    public Collection<Robot> getRobotCollection() {
        return robotCollection;
    }

    public void setRobotCollection(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public void action() {
        for (Robot robot : robotCollection)
            robot.action();
    }
}
