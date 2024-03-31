package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso = scanner.nextDouble();
        double pesoMaximo = peso + peso * 15 / 100;
        double pesoMinimo = peso - peso * 20 / 100;

        System.out.println(pesoMaximo);
        System.out.println(pesoMinimo);
    }
}