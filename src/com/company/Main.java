package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner sc;


    public static void main(String[] args) {
        // write your code here
        sc = new Scanner(System.in);
        System.out.println("Vvedine pervoe chislo");
        int first;
        first = sc.nextInt();
        System.out.println("Vvedine vtoroe chislo");
        int last;
        last = sc.nextInt();
        if (first < last) {
            for (int i = first; i <= last; i++) {
                System.out.print(i + " ");

            }
        } else if (first == last) {
            System.out.print(first);
        } else {
            for (int i = first; i >= last; i--) {
                System.out.print(i + " ");

            }
        }
    }
}

