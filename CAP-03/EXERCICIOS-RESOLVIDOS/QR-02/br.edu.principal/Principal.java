package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1 = Double.parseDouble(scanner.next());
        double nota2 = Double.parseDouble(scanner.next());
        double nota3 = Double.parseDouble(scanner.next());

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println(media);
    }
}