package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
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
//        clock();
        roll(4);
        int arr[] = {3, 2, 1, 5,5};
        System.out.println(containsDuplicates(arr));
        System.out.println(calAverage(arr));

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int x[] = minAverage(weeklyMonthTemperatures);
        System.out.println(Arrays.toString(x));
    }

    public static void roll(int n){

        int randomNum,max=6,min=1;
        Random random=new Random();

        ArrayList<Integer> arrayList=new ArrayList<>();

        for (int i=0;i<n;i++){

            randomNum=random.nextInt(max-min)+1;

            arrayList.add(randomNum);

        }
        System.out.println(arrayList);
    }

    public static boolean containsDuplicates(int [] arr){
    int item;

    for (int i = 0; i < arr.length; i++){
        item = arr[i];
        for (int j= i+1; j < arr.length; j++){
            if (arr[j] == item){
                return false;
            }
        }

        }
    return true;
    }

    public static double calAverage(int [] arr){
        double sum = 0;
        double avg;
        for (int i = 0; i< arr.length; i++){
            sum = sum + arr[i];

        }
        avg = sum/arr.length;
        return avg;
    }

    public static int[] minAverage (int[][] arr){
        int sum;
        double avg;
        double minAvg= Integer.MAX_VALUE;

        int minArr[]=arr[0];

        for (int i=0 ; i < arr.length; i++){
            sum=0;
            for (int j=0 ; j<arr[i].length; j++){
                sum =sum + arr[i][j];
            }
            avg =sum/arr[i].length;

            if (avg<minAvg){
                minAvg = avg;
                minArr = arr [i];
            }
        }
        return minArr;
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
        System.out.println("It took " +flipNum +" flips to flip "+ headNum+ " head in a row.");
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

