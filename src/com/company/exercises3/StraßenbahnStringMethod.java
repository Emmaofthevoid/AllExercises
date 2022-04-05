package com.company.exercises3;

public class StraßenbahnStringMethod {
    public static void main(String[] args) {
        int haltestelle = 1;
       for (int i = haltestelle; haltestelle <= 6; haltestelle++) {
            System.out.println(welcheHaltestelle(haltestelle));
        }

    }

    public static String welcheHaltestelle(int haltestelle) {
        String str = " ";
        if (haltestelle == 1) {
            str = "von die haltestelle " + haltestelle + " sind es noch 20mn bis zum Ende";
            return str;
        } else if (haltestelle == 2) {
            str = "von die haltestelle" + haltestelle + "sind es noch 16mn bis zum Ende";
            return str;
        } else if (haltestelle == 3) {
            str = "von die haltestelle" + haltestelle + "sind es noch 15mn bis zum Ende";
            return str;
        } else if (haltestelle == 4) {
            str = "von die haltestelle" + haltestelle + "sind es noch 10mn bis zum Ende";
            return str;
        } else if (haltestelle == 5) {
            str = "von die haltestelle" + haltestelle + "sind es noch 2mn bis zum Ende";
            return str;
        } else if (haltestelle == 6) {
            str = "please get tf out of my bus";
            return str;
        }
        return str;
    }

}
