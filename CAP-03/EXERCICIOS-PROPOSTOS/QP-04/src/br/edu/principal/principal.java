package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota1, nota2, peso2, peso3, media;
	
		
		peso2 = 2;
		peso3 = 3;
		
		 System.out.println("Digite nota1:");
		 nota1 = sc.nextInt();
		 
		 System.out.println("Digite nota2:");
		 nota2 = sc.nextInt();
		 
    System.out.println("Media Ponderada:");
	
    media = (nota1 * peso2 + nota2 * peso3)/(peso2 + peso3); 
	
	System.out.println(media); 
	
	sc.close();
	}

}
