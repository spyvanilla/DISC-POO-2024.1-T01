package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double num,quad,cubo,r2,r3;
	
	System.out.println("Digite um n�mero: ");
	num = sc.nextDouble();
	
	if(num>0) {
		System.out.println("O n�mero inserido foi "+num+"\n\n");
		quad=num*num;
		cubo=num*num*num;
		r2=Math.sqrt(num);
		r3=Math.cbrt(num);
		System.out.println("O quadrado desse numero �: "+quad);
		System.out.println("O cubo desse numero �: "+cubo);
		System.out.println("A raiz quadrada desse numero �: "+r2);
		System.out.println("A raiz c�bica desse numero �: "+r3);
		}else {
			System.out.println("Voc� deve inserir um valor positivo.");
		}

	}

}
