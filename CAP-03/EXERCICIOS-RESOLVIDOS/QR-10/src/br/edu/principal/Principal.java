package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double area = 3.1415 * Math.pow(raio, 2);

        System.out.println(area);
    }
}