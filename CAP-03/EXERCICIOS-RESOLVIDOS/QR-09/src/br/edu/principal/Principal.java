package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double area = base * altura / 2;

        System.out.println(area);
    }
}