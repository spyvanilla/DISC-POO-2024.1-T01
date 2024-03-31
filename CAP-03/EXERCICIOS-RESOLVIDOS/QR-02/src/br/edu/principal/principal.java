//Q1.CAP-03: Faça um programa que receba três notas, calcule e mostre a média aritmética.\\

package br.edu.principal;

import java.util.Scanner;

public class principal {

	 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  nota1, nota2, nota3; 
		int media = 0; 	
		
		System.out.println("Digite a nota1:");
		nota1 = sc.nextInt(); 
		
		System.out.println("Digite a nota2:");
		nota2 = sc.nextInt(); 
		
		System.out.println("Digite a nota3:");
		nota3 = sc.nextInt();
		
		System.out.println("media das notas:");
		
	    media = (nota1+nota2+nota3)/3;
	    System.out.println(media);
	    
	    sc.close();
	}
}
