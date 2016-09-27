package ru.geekbrains.java1.dz.dz1.BuynichevAlexey;

/**
 * Created by LeXXeR on 25.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        // Task #2
        byte by = 1;
        short sh = 1;
        int in = 1;
        long lo = 1L;
        float fl = 1F;
        double dou = 1;
        boolean bo = true;
        char ch = 'S';

        // Task #3
        int a = 2;
        int b = 4;
        int c = 10;
        int d = 5;
        System.out.println(calc(a,b,c,d));

        // Task #4
        a = 8;
        b = 9;
        System.out.println(checkSum(a,b));

        // Task #5
        a = 2000;
        System.out.println(checkYear(a));
    }

    public static float calc(int a,int b,int c,int d){
        return a*(b+(c/d));
    }

    public static boolean checkSum(int a, int b){
        if ((a+b)>=10 && (a+b)<=20)
            return true;
        else
            return false;
    }

    public static boolean checkYear(int a){
        if (a%4==0 && a%100!=0 || a%400==0)
            return true;
        else
            return false;
    }
}
