/*Q1.CAP-04:Fa�a um programa que receba o sal�rio de um funcion�rio, calcule e mostre o novo sal�rio, sabendo-se
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
	
	
	System.out.println("O novo salario � de");
	newsalario = salario + aumento;
	System.out.println(newsalario);
   
   sc.close();
	    
	}
}