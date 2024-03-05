package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(string[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1 = Double.parseDouble(scanner.next());
        double nota2 = Double.parseDouble(scanner.next());
        double nota3 = Double.parseDouble(scanner.next());
        double peso1 = Double.parseDouble(scanner.next());
        double peso2 = Double.parseDouble(scanner.next());
        double peso3 = Double.parseDouble(scanner.next());

        double soma1 = nota1 * peso1;
        double soma2 = nota2 * peso2;
        double soma3 = nota3 * peso3;

        double total = peso1 + peso2 + peso3;
        double media = (soma1 + soma2 + soma3) / total;

        System.out.println(media);
    }
}