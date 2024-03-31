package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anoAtual,anoNasc,idadeAtual,idade2050;
		
		System.out.println("Digite o ano que estamos: ");
		anoAtual=sc.nextInt();
		System.out.println("Digite o ano em que você nasceu: ");
		anoNasc=sc.nextInt();
		
		if(anoAtual>0&&anoNasc>0) {
		  idadeAtual=anoAtual-anoNasc;
		  idade2050=2050-anoNasc;
		  System.out.println("Atualmente você tem "+idadeAtual+" e em 2050 você terá "+idade2050);
	   }else {
		   System.out.println("add anos positivos");
	   }
	}

}
