package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			double salFix,vlrVendas,comissao,salFinal;
			
			System.out.println("Qual o seu salário FIXO?");
			salFix=sc.nextDouble();
			System.out.println("Digite o valor das suas vendas:");
			vlrVendas=sc.nextDouble();
	        
			if(salFix>0 && vlrVendas>0) {
				comissao=vlrVendas*0.04;
				salFinal=comissao+salFix;
				System.out.println("Sua comissao é de R$"+comissao);
				System.out.println("Seu salário final é de R$"+salFinal);
			}else {
				System.out.println("Insira valores positivos");
			}
		
		   sc.close();
	}

}
