package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
System.out.println("Qual o valor do salário?");
float salario = sc.nextFloat();
System.out.println("Qual o valor do primeiro cheque?");
float cheque1 = sc.nextFloat();
System.out.println("Qual o valor do segundo cheque?");
float cheque2 = sc.nextFloat();

float CPMF1 = (float) (cheque1 * 0.38/100);
float CPMF2 = (float) (cheque2 * 0.38/100);

float saldo = (salario - cheque1 - cheque2 - CPMF1 - CPMF2);

System.out.println("O saldo é de: " + saldo);

sc.close();
	}
}
