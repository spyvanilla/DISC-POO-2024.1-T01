package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double num,quad,cubo,r2,r3;
	
	System.out.println("Digite um número: ");
	num = sc.nextDouble();
	
	if(num>0) {
		System.out.println("O número inserido foi "+num+"\n\n");
		quad=num*num;
		cubo=num*num*num;
		r2=Math.sqrt(num);
		r3=Math.cbrt(num);
		System.out.println("O quadrado desse numero é: "+quad);
		System.out.println("O cubo desse numero é: "+cubo);
		System.out.println("A raiz quadrada desse numero é: "+r2);
		System.out.println("A raiz cúbica desse numero é: "+r3);
		}else {
			System.out.println("Você deve inserir um valor positivo.");
		}

	}

}
