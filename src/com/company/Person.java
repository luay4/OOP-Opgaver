package com.company;

public class Person {
    private String name;
    private int age;

    public Person(String navn, int alder) {
        this.name = navn;
        this.age = alder;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void hasBirthday() {
        age++;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\t Age: " + age;
    }
}
