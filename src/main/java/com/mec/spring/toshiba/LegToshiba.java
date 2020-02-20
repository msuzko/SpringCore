package com.mec.spring.toshiba;

import com.mec.spring.interfaces.Leg;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LegToshiba implements Leg {
    @Override
    public void raise() {
        System.out.println("I raise my Toshiba leg");
    }
}
