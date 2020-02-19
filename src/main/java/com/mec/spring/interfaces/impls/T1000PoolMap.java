package com.mec.spring.interfaces.impls;

import com.mec.spring.interfaces.Robot;
import com.mec.spring.interfaces.RobotPoolMap;

import java.util.Map;

public class T1000PoolMap implements RobotPoolMap {

    Map<String, Robot> robotCollection;

    public T1000PoolMap(Map<String, Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    @Override
    public Map<String, Robot> getRobotCollection() {
        return robotCollection;
    }

    public void setRobotCollection(Map<String, Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public void action() {
        for (Robot robot : robotCollection.values())
            robot.action();
    }
}
