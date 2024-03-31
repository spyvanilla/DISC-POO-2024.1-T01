package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pFab,percDist,percImp,vlrLD,vlrI,precoF;
		
		System.out.println("Digite o preço de fabrica: ");
		pFab=sc.nextDouble();
		System.out.println("Digite o percentual de lucro: ");
		percDist=sc.nextDouble();
		System.out.println("Digite o percentual de imposto: ");
		percImp=sc.nextDouble();
		
		if(pFab>0 && percDist>0 && percImp>0) {
		 vlrLD=pFab*percDist/100;
		 vlrI=pFab*percImp/100;
		 precoF=pFab+vlrLD+vlrI;
		 System.out.println("O valor que corresponde ao lucro do distribuidor é: "+vlrLD);
		 System.out.println("O valor dos impostos são: "+vlrI);
		 System.out.println("O preço final do carro é : "+precoF);
		}else {
			System.out.println("Digite valores positivos para obter as informaões do veiculo");
		}		
	}
}
