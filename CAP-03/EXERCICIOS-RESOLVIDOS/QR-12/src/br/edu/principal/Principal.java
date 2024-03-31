package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1,num2,r1,r2;
		
		System.out.println("Digite o primeiro valor: ");
		num1 = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		num2 = sc.nextDouble();
		
		if(num1>0 && num2>0) {
		 r1=Math.pow(num1,num2);	
		 r2=Math.pow(num2,num1);
		 System.out.println("raiz 1 é "+r1+" e raiz 2 é "+r2);
		}else {
			System.err.println("O número digitado não é válido");
		}

	}

}
