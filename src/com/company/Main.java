package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main implements EnWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int aleatoriu = random.nextInt(words.length);
        String cuvant = words[aleatoriu];
        char[] stoc = new char[cuvant.length()];
        int incercari = 0;

        System.out.println("Bine ai venit la Spanzuratoarea !!!\n" +
                "Introdu cate un caracter sau..\n" +
                "Daca stii deja cuvantul poti sa il tastezi pe tot");
        afisare(stoc, cuvant);

        while (true) {
            System.out.println("\nIntroduceti un caracter: ");
            String input = scanner.next();
            incercari++;
            if (cuvant.contains(input)) {
                for (int i = 0; i < cuvant.length(); i++) {
                    if (cuvant.substring(i, i + 1).equals(input.substring(0, 1))) {
                        stoc[i] = input.charAt(0);
                    }
                }
            }
            if (input.length() > 1) {
                if (cuvant.equals(input)) {
                    System.out.println("\nAi ghicit din " + incercari + " incercari !");
                    break;
                }
            }
            System.out.println();
            for (int i = 0; i < cuvant.length(); i++) {
                System.out.print(stoc[i]);
            }
            if (cuvant.equals(String.valueOf(stoc))) {
                System.out.println();
                System.out.println("\nAi ghicit din " + incercari + " incercari !");
                break;
            }
        }
    }

    public static void afisare(char[] stoc, String cuvant) {
        for (int i = 0; i < cuvant.length(); i++) {
            stoc[i] = '_';
            System.out.print(stoc[i]);
        }
    }
}