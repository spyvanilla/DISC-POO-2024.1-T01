package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextDouble();

        int i = (int) num;
        double f = num - i;
        double a = Math.round(f);

        System.out.println(i);
        System.out.println(f);
        System.out.println(a);
    }
}