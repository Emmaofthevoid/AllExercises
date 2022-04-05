package com.company.exercises2;

public class WinterTires {
    public static void main(String[] args) {
        needWinterTires(6, false);
    }

    public static boolean needWinterTires(int temperature, boolean slipperyRoad) {
        if ((temperature < 10 && slipperyRoad) || (temperature < 4)) {
            System.out.println("Please use winter tires");
            return true;
        } else {
            System.out.println("Don't need winter tires");
            return false;
        }
    }
}
