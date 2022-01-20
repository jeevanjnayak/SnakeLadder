package com.Bridgelabz;


public class TwoPlayer {
    public static final int Ladder = 1;
    public static final int Snake =2;
    public static final int Max = 6, Min = 1;

    public static void main(String[] args) {
        int DiceRolled1 = 0, DiceRolled2 = 0;
        int RandNum = 0;
        System.out.println("welcome player1 and player2");
        DiceRolled1 = game(DiceRolled1 , RandNum);
        DiceRolled2 = game(DiceRolled2 , RandNum);
        int Diff = DiceRolled1 - DiceRolled2;
        if(Diff <= 0)
            System.out.println("player1 is the winner");
        else
            System.out.println("player2 is the winner");
    }

    public static int game(int DiceRolled, int RandNum) {
        DiceRolled = 0;
        int Position = 0;
        while (Position < 100) {
            RandNum = (int) Math.floor(Math.random() * (Max - Min + 1) + Min);
            DiceRolled += 1;
            int TempPosition = (int) Math.floor(Math.random() * 10) % 3;
            if(TempPosition == 1)
                DiceRolled -=1;
            switch (TempPosition) {
                case Ladder:
                    Position += RandNum;
                    if (Position > 100)
                        Position -= RandNum;
                    break;
                case Snake:
                    Position -= RandNum;
                    if (Position < 0)
                        Position = 0;
                    break;
                default:
                    break;
            }
        }
    return DiceRolled;
    }
}