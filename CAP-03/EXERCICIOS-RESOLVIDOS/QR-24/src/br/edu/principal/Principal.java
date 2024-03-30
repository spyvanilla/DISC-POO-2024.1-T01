package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hora = scanner.nextDouble();

        int h = (int) hora;
        double m = hora - h;
        double conversao = (h * 60) + (m * 60);

        System.out.println(conversao);
    }
}