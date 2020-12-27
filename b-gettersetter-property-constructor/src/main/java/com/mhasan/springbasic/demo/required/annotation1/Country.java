package com.mhasan.springbasic.demo.required.annotation1;

import org.springframework.stereotype.Component;

@Component
public class Country {
    private String countryName;
    private Capital capital;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Capital getCapital() {
        return capital;
    }

   // @Required
    //@Autowired
    public void setCapital(Capital capital) {
        this.capital = capital;
    }
}
