package com.mec.spring;

import com.mec.spring.interfaces.Robot;
import com.mec.spring.interfaces.RobotConveyor;

public abstract class T1000Conveyor implements RobotConveyor {

    @Override
    public abstract Robot createRobot();
}
