package com.mec.spring.toshiba;

import com.mec.spring.interfaces.Head;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class HeadToshiba implements Head {
    @Override
    public void say() {
        System.out.println("I'm Toshiba head");
    }
}
