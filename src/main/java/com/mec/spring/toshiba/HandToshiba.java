package com.mec.spring.toshiba;

import com.mec.spring.interfaces.Hang;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class HandToshiba implements Hang {

    @Override
    public void clap() {
        System.out.println("I clap my Toshiba hands");
    }
}
