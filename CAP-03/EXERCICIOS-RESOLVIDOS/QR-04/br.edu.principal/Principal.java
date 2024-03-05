package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sal = Double.parseDouble(scanner.next());
        double novosal = sal + sal * 25/100

        System.out.println(novosal);
    }
}