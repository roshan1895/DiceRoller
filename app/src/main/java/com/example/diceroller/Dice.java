package com.example.diceroller;

import java.util.Random;

public class Dice {
    public Dice()
    {

    }
    int roll()
    {   return new Random().nextInt(6)+1;

    }
}
