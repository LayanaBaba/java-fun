package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main{
    public static String pluralize(String string, int count){
        if (count == 1){
            return string;
        }else{
            return string + "s";
        }
    }


    public static void main(String[] args){
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(2);
        clock();
    }

    public static void flipNHeads(int headRow){
        int flipNum=0, headNum=0;
        double coins;
        Random randomNum = new Random();

        while (headNum!=headRow){

            coins = randomNum.nextDouble();

            if(coins>=0.5){
                System.out.println("heads");
                headNum=headNum+1;
                flipNum=flipNum+1;
        }else {
                System.out.println("tails");
                headNum=0;
                flipNum=flipNum+1;
            }
        }
            System.out.println("It took " +flipNum +" "+ pluralize("flip",flipNum) +" to flip "+ headNum+ " head in a row.");
    }

    public static void clock(){

        while (true){

            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
// or, if you're feeling fancy
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            while (second== LocalDateTime.now().getSecond()){

             continue;
            }
            System.out.println(time);
        }

    }
}

