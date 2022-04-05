package com.company.exercises2;

public class LeapYear {
    public static void main(String[] args) {
        for (int i = 1; i < 2100; i++) {
            isLeapYear(i);
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
            return true;
        } else {
            System.out.println(year + " is NOT a leap year");
            return false;
        }
    }
}
