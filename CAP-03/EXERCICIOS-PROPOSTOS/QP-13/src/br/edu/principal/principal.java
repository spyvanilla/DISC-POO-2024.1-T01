package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numUser; 
		
		System.out.print("Digite um numéro:");
		numUser = sc.nextInt(); 
		System.out.println("");
		System.out.println("Essa é taubuada de multiplicação dele");
		System.out.println("");
		System.out.println("Multiplicado por 1:");
		System.out.println(1 * numUser);
		System.out.println("Multiplicado por 2:");
		System.out.println(2 * numUser);
		System.out.println("Multiplicado por 3:");
		System.out.println(3 * numUser);
		System.out.println("Multiplicado por 4:");
		System.out.println(4 * numUser);
		System.out.println("Multiplicado por 5:");
		System.out.println(5 * numUser);
		System.out.println("Multiplicado por 6:");
		System.out.println(6 * numUser);
		System.out.println("Multiplicado por 7:");
		System.out.println(7 * numUser);
		System.out.println("Multiplicado por 8:");
		System.out.println(8 * numUser);
		System.out.println("Multiplicado por 9:");
		System.out.println(9 * numUser);
		System.out.println("Multiplicado por 10:");
		System.out.println(10 * numUser);
		
		sc.close();
	}
	
	
	

}
