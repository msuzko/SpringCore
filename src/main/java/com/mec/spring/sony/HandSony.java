package com.mec.spring.sony;

import com.mec.spring.interfaces.Hang;

public class HandSony implements Hang {

    @Override
    public void clap() {
        System.out.println("I clap my Sony hands");
    }
}
