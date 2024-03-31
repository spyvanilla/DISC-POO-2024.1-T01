package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pes,polegadas,jardas,milhas;
		
		System.out.println("Digite pes: ");
		pes = sc.nextDouble();
		
		if(pes>0) {
			polegadas = pes*12;
			jardas = pes/3;
			milhas = jardas/1.760;
			System.out.println("Polegadas equivale a "+polegadas);
			System.out.println("Jardas equivale a "+jardas);
			System.out.println("Milhas equivale a "+milhas);
		}else {
			System.out.println("o valor inserido nao é valido. Insira um vlor positivo;)");
		}
	}

}
