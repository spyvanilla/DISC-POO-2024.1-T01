/*Q4.Cap-03:Fa�a um programa que receba o sal�rio de um funcion�rio e o percentual de aumento, calcule e mostre
o valor do aumento e o novo sal�rio.*/

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
	
	System.out.println("O novo salario � de");
	newsalario = salario + aumento; 
	System.out.println(newsalario);
	
	sc.close();
	    
	}
}