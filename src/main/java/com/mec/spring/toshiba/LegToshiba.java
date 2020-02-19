package com.mec.spring.toshiba;

import com.mec.spring.interfaces.Leg;

public class LegToshiba implements Leg {
    @Override
    public void raise() {
        System.out.println("I raise my Toshiba leg");
    }
}
