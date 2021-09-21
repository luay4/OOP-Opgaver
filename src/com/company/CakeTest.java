package com.company;

public class CakeTest {

    public static void main(String[] args) {
        Cake drømmekage = new Cake(8);

        System.out.println(drømmekage.samletVægt());
        System.out.println(drømmekage.bagtVægt());
        System.out.println(drømmekage.energiKage() + "\n");
        drømmekage.setAntalPersoner(16);

        System.out.println(drømmekage.samletVægt());
        System.out.println(drømmekage.bagtVægt());
        System.out.println(drømmekage.energiKage() + "\n");

        System.out.println(drømmekage.getAntalPersoner());

        System.out.println(drømmekage);
    }
}
