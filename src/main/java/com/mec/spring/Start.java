package com.mec.spring;

import com.mec.spring.robots.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
        ModelT1000 model1 = context.getBean("model1", ModelT1000.class);
        ModelT1000 model2 = context.getBean("model2", ModelT1000.class);
        model1.action();
        model2.action();

//        RobotConveyor t1000Conveyor = context.getBean("t1000Conveyor", RobotConveyor.class);
//        Robot terminator1 = t1000Conveyor.createRobot();
//        Robot terminator2 = t1000Conveyor.createRobot();
//        Robot terminator3 = t1000Conveyor.createRobot();
//        System.out.println("Terminator1 " + terminator1);
//        System.out.println("Terminator2 " + terminator2);
//        System.out.printl n("Terminator3 " + terminator3);
//
//        terminator1.action();
//        T1000PoolList pool = context.getBean("t1000GoldenPoolFromList", T1000PoolList.class);
//        pool.action();
    }
}
