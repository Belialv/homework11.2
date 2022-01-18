package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = x.nextInt();
        System.out.println("Введите второе число:");
        int b = x.nextInt();
        System.out.println("Введите третье число:");
        int c = x.nextInt();
        if (a < b && a < c) {
            System.out.println(a);
        }
        if (b < a && b < c) {
            System.out.print(b);
        }
        if (c < a && c < b) {
            System.out.print(c);
        }
        if (a == c && a == b) {
            System.out.print(a);
        }
        if (b == a && b == c) {
            System.out.print(b);
        }
        if (c == a && c == b) {
            System.out.print(c);
        }
    }
}
