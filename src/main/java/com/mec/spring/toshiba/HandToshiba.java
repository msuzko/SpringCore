package com.mec.spring.toshiba;

import com.mec.spring.interfaces.Hang;

public class HandToshiba implements Hang {

    @Override
    public void clap() {
        System.out.println("I clap my Toshiba hands");
    }
}
