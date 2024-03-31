/*Q1.CAP-04:Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se
que este sofreu um aumento de 25%.*/


package br.edu.principal;

import java.util.Scanner;

public class principal {

	 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	int salario, newsalario, aumento;  
	
	System.out.println("Digite o salario:");
	salario = sc.nextInt();
	
	aumento = salario * 25/100; 
	
	
	System.out.println("O novo salario é de");
	newsalario = salario + aumento;
	System.out.println(newsalario);
   
   sc.close();
	    
	}
}