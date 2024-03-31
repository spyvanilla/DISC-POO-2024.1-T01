/*Q4.Cap-03:Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre
o valor do aumento e o novo salário.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	 
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int salario, perc, aumento, newsalario; 
	
	System.out.println("Digite o salario:");
	salario = sc.nextInt(); 
	
	System.out.println("Digite o percentual:");
	perc = sc.nextInt(); 
	
	System.out.println("O aumento foi de:");
	aumento = salario * perc/100; 
	System.out.println(aumento);
	
	System.out.println("O novo salario é de");
	newsalario = salario + aumento; 
	System.out.println(newsalario);
	
	sc.close();
	    
	}
}