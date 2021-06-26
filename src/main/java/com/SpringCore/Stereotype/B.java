package com.SpringCore.Stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class B {
    @Value("Cricket")
    private String sport;
    @Value("Rajma Chawal")
    private String food;

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "B{" +
                "sport='" + sport + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
