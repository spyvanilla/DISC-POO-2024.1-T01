package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float lado,area;
		System.out.println("Calculo área do QUADRADO");
		System.out.println("Digite o valor do lado do qudrado");
		lado=sc.nextFloat();
		if(lado>0) {
			area=lado*lado;
			System.out.println("A área do quadrado equivale a "+area+"M^2");
		}else {
			System.out.println("Insira valores reais positivos");
		}
		sc.close();
	}
}
