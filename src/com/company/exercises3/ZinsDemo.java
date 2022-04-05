package com.company.exercises3;

public class ZinsDemo {
    public static void main(String[] args) {
        //method 1
    double kontostand = 1000;
    double zinsen = 2.25;
        System.out.println(zinsen/100*kontostand);
        //method 2
        System.out.println( calculateTaxes(2000,3.45));
    }
    public static double calculateTaxes ( double kontostand, double zinsen) {
        return zinsen/100*kontostand;

    }
}
