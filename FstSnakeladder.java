package com.company;

import java.util.Random;

public class FstSnakeladder {
    public static final int Ladder = 1;
    public static final int Snake =2;
    public static void main(String[] args) {
        int Position = 0, Max = 6, Min = 1;
        System.out.println("welcome player number 1");
        int RandNum = (int)Math.floor(Math.random()*(Max-Min+1)+Min);
        System.out.println("first number rolled in dice: "+RandNum);
        int TempPosition = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println(TempPosition+ " is the temp number");
        switch (TempPosition) {
            case Ladder:
                Position += RandNum;
                break;
            case Snake:
                Position -= RandNum;
                break;
            default:
                break;
        }
        System.out.println("you are at "+Position+" position");
    }
}