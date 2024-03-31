package br.principal.edu;

import java.util.Scanner;

public class Principal {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);

System.out.println("Qual o número de lados do polígono convexo?");
int N = sc.nextInt();
int ND = (N * (N - 3))/2;

System.out.println("O número de diagonais do polígono convexo é: " + ND);

sc.close();
		}
}
