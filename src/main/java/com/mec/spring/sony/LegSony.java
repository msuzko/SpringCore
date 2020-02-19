package com.mec.spring.sony;

import com.mec.spring.interfaces.Leg;

public class LegSony implements Leg {
    @Override
    public void raise() {
        System.out.println("I raise my Sony leg");
    }
}
