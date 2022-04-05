package com.company.exercises2;

public class Triangle {
    public static void main(String[] args) {
        makeTriangle(7);
    }

    public static void makeTriangle(int value) {
        // all the values of j will be printed every i loop
        for (int i = 0; i <= value; i++) {
            for (int j = 0; j <= i; j++) {
                //only print, no ln, so that the numbers are printed one next to each other
                System.out.print(j + " ");
            }
            //here a line so that every loop is printed in a different line
            System.out.println();
        }
    }
}
