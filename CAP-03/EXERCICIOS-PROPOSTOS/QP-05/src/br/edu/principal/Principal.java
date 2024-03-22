package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = scanner.nextDouble();
        double newPrice = price - price * 1 / 10;

        System.out.println(newPrice);
    }
}