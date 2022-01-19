package com.company;

import java.util.Random;

public class FstDiceRoll {

    public static void main(String[] args) {
        int position = 0, max = 6, min = 1;
        System.out.println("welcome player number 1");
        int rand_num = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("first number rolled in dice: "+rand_num);
    }
}