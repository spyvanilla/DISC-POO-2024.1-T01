package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dep = scanner.nextDouble();
        double taxa = scanner.nextDouble();
        double rend = dep * taxa / 100;
        double total = dep + rend;

        System.out.println(total);
    }
}