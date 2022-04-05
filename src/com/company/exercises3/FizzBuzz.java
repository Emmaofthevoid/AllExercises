package com.company.exercises3;

public class FizzBuzz {
    public static void main(String[] args) {
        teilbareZahlen(1);
        teilbareZahlen(5);
        System.out.println("******");
        for (int i = 0; i < 100; i++) {
            teilbareZahlen(i);
        }
    }

    public static int teilbareZahlen(int zahl) {
        String fizzBuzz = " ";

            if (zahl % 3 == 0 && zahl % 5 == 0) {
                fizzBuzz = " FizzBuzz";
                System.out.println(zahl + fizzBuzz);
            } else if (zahl % 3 == 0) {
                fizzBuzz = " Fizz";
                System.out.println(zahl + fizzBuzz);
            } else if (zahl % 5 == 0) {
                fizzBuzz = " Buzz";
                System.out.println(zahl + fizzBuzz);
            } else {
                System.out.println(zahl);
            }
        return zahl;
    }
    public static String [] richtigeString (int zahl) {
       String [] namesOfTeiler = new String [0];

        for (int i = 0; i < teilbareZahlen(zahl); i++) {
            namesOfTeiler = namesOfTeiler;
        }


        return namesOfTeiler ;
    }
}
