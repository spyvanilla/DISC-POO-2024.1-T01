package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();
        double length = 2 * 3.14 * radius;
        double area = 3.14 * Math.pow(radius, 2);
        double volume = 4 * 3.14 * Math.pow(radius, 3) / 3;

        System.out.println(length);
        System.out.println(area);
        System.out.println(volume);
    }
}