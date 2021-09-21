package com.company;

public class Lamp {
    private boolean light;

    public Lamp(boolean light) {
        this.light = light;
    }

    public Lamp() {
        light = false;
    }

    public void clickOnSwitch() {
        if (light) {
            light = false;
        }
        else if (!light) {
            light = true;
        }
    }

    public boolean isOn() {
        return light;
    }
}
