//Q1.CAP-03: Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números.\\

package br.edu.principal;

import java.util.Scanner;

public class principal {
	
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
int n1 ,n2, n3, n4 = 0; int soma = 0;

System.out.println("Diga o número 1:"); 
n1 = sc.nextInt();

System.out.println("Diga o número 2:");
n2 = sc.nextInt();

System.out.println("Diga o número 3:");
n3 = sc.nextInt();

System.out.println("Diga o número 4:");
n4 = sc.nextInt();

System.out.println("A soma dos numéros:");

soma = n1+n2+n3+n4;
System.out.println(soma);

 sc.close();
	}
}