package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.next());
        double n2 = Double.parseDouble(scanner.next());
        double n3 = Double.parseDouble(scanner.next());
        double n4 = Double.parseDouble(scanner.next());

        double SOMA = n1 + n2 + n3 + n4;
        System.out.println(SOMA);
    }
}