package br.principal.edu;

import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		Scanner sc  = new Scanner(System.in);
		
System.out.println("Qual o número de horas trabalhadas?");
float numhorast = sc.nextFloat();
System.out.println("Qual o valor do salário mínimo?");
float salmin = sc.nextFloat();

float vlrhoratrabalhada = (salmin/2);
float salbruto = (numhorast * vlrhoratrabalhada);
float imposto = (3 * salbruto/100);
float salreceber = (salbruto - imposto);

System.out.println("O salário a receber é: " + salreceber);

sc.close();
	}
}
