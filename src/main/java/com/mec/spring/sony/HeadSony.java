package com.mec.spring.sony;

import com.mec.spring.interfaces.Head;

public class HeadSony implements Head {
    @Override
    public void say() {
        System.out.println("I'm Sony head");
    }
}
