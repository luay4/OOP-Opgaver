package com.company;

public class DiceTest {
    public static void main(String[] args) {
        Dice dice = new  Dice();
        Dice dice1 = new  Dice();
        Dice dice2 = new  Dice();
        Dice dice3 = new  Dice();
        Dice dice4 = new  Dice();
        Dice dice5 = new  Dice();

        System.out.println(dice.getFaceValue());

        dice.roll();

        System.out.println(dice.getFaceValue());

        Dice[] diceArray = {dice1, dice2, dice3, dice4, dice5};

        for (int i = 0; i < 5; i++) {
            diceArray[i].roll();
        }

        int sum = 0;

        for (int i = 0; i < diceArray.length; i++) {
            sum += diceArray[i].getFaceValue();
        }

        System.out.println("The sum of the dice throws: " + sum);
    }
}
