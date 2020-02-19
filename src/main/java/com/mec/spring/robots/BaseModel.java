package com.mec.spring.robots;

import com.mec.spring.interfaces.Hang;
import com.mec.spring.interfaces.Head;
import com.mec.spring.interfaces.Leg;
import com.mec.spring.interfaces.Robot;

public abstract class BaseModel implements Robot {

    private Head head;
    private Hang hand;
    private Leg leg;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor()");
    }

    public BaseModel(Head head, Hang hand, Leg leg) {
        this();
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hang getHand() {
        return hand;
    }

    public void setHand(Hang hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}
