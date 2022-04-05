package com.company.exercises3;

public class Straßenbahn {
    public static void main(String[] args) {
        welcheHaltestelle(1, true, 2, 5);
    }

    public static void welcheHaltestelle(int haltestelle, boolean verspätung, int verspäteteHaltestelle, int wieVieleVerspätung) {
        //gotta initialize i before making the for loop, otherwise it doesn't recognise it
        if (verspätung) {
            System.out.println("there is a verspätung in station " + verspäteteHaltestelle + " of " + wieVieleVerspätung + " minutes.");
        } else {
            // initialize variable i just for the purpose of navigating the ifs with the for loop
            int i = haltestelle;
            for (i = haltestelle; haltestelle <= 6; haltestelle++) {

                if (haltestelle == 1) {
                    System.out.println("20 mns to destination");
                } else if (haltestelle == 2) {
                    System.out.println("16 mns to destination");
                } else if (haltestelle == 3) {
                    System.out.println("15 mns to destination");
                } else if (haltestelle == 4) {
                    System.out.println("10 mns to destination");
                } else if (haltestelle == 5) {
                    System.out.println("3 mns to destination, please get ready");
                } else if (haltestelle == 6) {
                    System.out.println("GO OUT, GO OUT!!");
                }
            }
        }
    }
}
