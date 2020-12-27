package com.mhasan.springbasic.demo.required.annotation1;

import org.springframework.stereotype.Component;

@Component
public class Capital {
    String capitalName;
    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }



}
