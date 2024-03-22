package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Z = scanner.nextDouble();
        double X = scanner.nextDouble();
        double Y = Math.pow(Z, 2) - Math.pow(X, 2);
        Y = Math.pow(Y, 1/2);

        System.out.println(Y);
    }
}