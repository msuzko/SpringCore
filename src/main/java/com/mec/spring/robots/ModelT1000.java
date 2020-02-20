package com.mec.spring.robots;

import com.mec.spring.enums.ColorStyle;
import com.mec.spring.interfaces.Hang;
import com.mec.spring.interfaces.Head;
import com.mec.spring.interfaces.Leg;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean {

    private ColorStyle color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000() {
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model1() {
        return new ModelT1000();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model2() {
        return new ModelT1000(ColorStyle.BLACK,2005,true);
    }

    public ModelT1000(Head head, Hang hand, Leg leg, ColorStyle color, int year, boolean soundEnabled) {
//        super(head, hand, leg);
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(ColorStyle color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ColorStyle getColor() {
        return color;
    }

    public void setColor(ColorStyle color) {
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
