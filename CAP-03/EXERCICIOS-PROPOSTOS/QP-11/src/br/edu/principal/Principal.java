package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double diagonalMaior = 10;
        double diagonalMenor = 2;
        double area = (diagonalMaior * diagonalMenor) / 2;

        System.out.println(area);
    }
}