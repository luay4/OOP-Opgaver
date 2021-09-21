package com.company;

public class LampTest {
    public static void main(String[] args) {
        Lamp bedroomLamp = new Lamp(true);
        Lamp livingroomLamp = new Lamp(false);
        Lamp kitchenLamp = new Lamp();

        System.out.println(bedroomLamp.isOn());
        System.out.println(livingroomLamp.isOn());
        System.out.println(kitchenLamp.isOn());

        System.out.println();

        bedroomLamp.clickOnSwitch();
        livingroomLamp.clickOnSwitch();
        kitchenLamp.clickOnSwitch();

        System.out.println(bedroomLamp.isOn());
        System.out.println(livingroomLamp.isOn());
        System.out.println(kitchenLamp.isOn());
    }
}
