package com.mec.spring;

import com.mec.spring.interfaces.impls.T1000PoolList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
        //Model1000 t1000 = context.getBean("t1000", Model1000.class);

//        RobotConveyor t1000Conveyor = context.getBean("t1000Conveyor", RobotConveyor.class);
//        Robot terminator1 = t1000Conveyor.createRobot();
//        Robot terminator2 = t1000Conveyor.createRobot();
//        Robot terminator3 = t1000Conveyor.createRobot();
//        System.out.println("Terminator1 " + terminator1);
//        System.out.println("Terminator2 " + terminator2);
//        System.out.println("Terminator3 " + terminator3);
//
//        terminator1.action();
        T1000PoolList pool = context.getBean("t1000Pool", T1000PoolList.class);
        pool.action();
    }
}
