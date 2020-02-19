package com.mec.spring.robots;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Model1000 extends BaseModel implements InitializingBean, DisposableBean {

    private String color;
    private int year;
    private boolean soundEnabled;

//    public Model1000(Head head, Hang hand, Leg leg) {
//        super(head, hand, leg);
//    }
//
//    public Model1000(Head head, Hang hand, Leg leg, String color, int year, boolean soundEnabled) {
//        super(head, hand, leg);
//        this.color = color;
//        this.year = year;
//        this.soundEnabled = soundEnabled;
//    }

//    public Model1000(String color, int year, boolean soundEnabled) {
//        this.color = color;
//        this.year = year;
//        this.soundEnabled = soundEnabled;
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }


    @Override
    public void action() {
        getHead().say();
        getLeg().raise();
        getHand().clap();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("soundEnabled: " + soundEnabled);
    }

    @Override
    public void run() {
        System.out.println("I'm running");
    }

//    private void initObject() {
//        System.out.println("init");
//    }
//
//    private void destroyObject() {
//        System.out.println("destroy");
//    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this + " - method destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this + " - method afterPropertiesSet()");

    }
}
