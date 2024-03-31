//Q1.CAP-03:Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.\\ 


package br.edu.principal;

import java.util.Scanner;

public class Principal {

	 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	int nota1, nota2, nota3, peso1, peso2, peso3; 
	int media;
		
   System.out.println("Digite a nota1:");
   nota1 = sc.nextInt();
   
   System.out.println("Digite a nota2:");
   nota2 = sc.nextInt();
   
   System.out.println("Digite a nota3:");
   nota3 = sc.nextInt();
   
   System.out.println("Digite o peso1:");
   peso1 = sc.nextInt();
   
   System.out.println("Digite o peso2:");
   peso2 = sc.nextInt();
   
   System.out.println("Digite o peso3:");
   peso3 = sc.nextInt();
   
   System.out.println("A media é:"); 
    media = (nota1*peso1+ nota2*peso2+ nota3*peso3)/(peso1+ peso2+ peso3); 
   System.out.println(media);
   
   sc.close();
	    
	}
}