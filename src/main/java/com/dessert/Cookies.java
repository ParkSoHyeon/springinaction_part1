package com.dessert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cookies implements Dessert {
    private Dessert dessert;

    @Autowired
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
