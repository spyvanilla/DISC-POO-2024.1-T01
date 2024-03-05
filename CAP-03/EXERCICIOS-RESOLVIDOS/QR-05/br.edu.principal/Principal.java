package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sal = Double.parseDouble(scanner.next());
        double perc = Double.parseDouble(scanner.next());

        double aumento = sal * perc / 100;
        double novosal = sal + aumento;

        System.out.println(aumento);
        System.out.println(novosal);
    }
}