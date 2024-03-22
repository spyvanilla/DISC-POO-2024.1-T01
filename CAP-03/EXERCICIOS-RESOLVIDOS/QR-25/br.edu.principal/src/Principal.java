package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double custo = scanner.nextDouble();
        double convite = scanner.nextDouble();
        double qtd = custo / convite;

        System.out.println(qtd);
    }
}