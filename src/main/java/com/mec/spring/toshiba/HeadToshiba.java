package com.mec.spring.toshiba;

import com.mec.spring.interfaces.Head;

public class HeadToshiba implements Head {
    @Override
    public void say() {
        System.out.println("I'm Toshiba head");
    }
}
