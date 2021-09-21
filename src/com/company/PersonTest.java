package com.company;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Luay", 21);

        String name = person1.getName();
        int age = person1.getAge();

        System.out.println(name + " " + age);

        person1.hasBirthday();

        System.out.println(person1);
    }
}
