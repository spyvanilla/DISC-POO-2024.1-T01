//Q1.CAP-03: Fa�a um programa que receba quatro n�meros inteiros, calcule e mostre a soma desses n�meros.\\

package br.edu.principal;

import java.util.Scanner;

public class principal {
	
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
int n1 ,n2, n3, n4 = 0; int soma = 0;

System.out.println("Diga o n�mero 1:"); 
n1 = sc.nextInt();

System.out.println("Diga o n�mero 2:");
n2 = sc.nextInt();

System.out.println("Diga o n�mero 3:");
n3 = sc.nextInt();

System.out.println("Diga o n�mero 4:");
n4 = sc.nextInt();

System.out.println("A soma dos num�ros:");

soma = n1+n2+n3+n4;
System.out.println(soma);

 sc.close();
	}
}