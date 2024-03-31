package br.principal.edu;

import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
System.out.println("Qual o peso do saco de ração, em quilogramas?");
float psr = sc.nextFloat();
System.out.println("Qual a quantidade de ração fornecida para o primeiro gato, em gramas?");
float racaogato1 = sc.nextFloat();
System.out.println("Qual a quantidade de ração fornecida para o segundo gato, em gramas?");
float racaogato2 = sc.nextFloat();

racaogato1 = (racaogato1 / 1000);
racaogato2 = (racaogato2 / 1000);
float totalfinal = psr - 5 * (racaogato1 + racaogato2);

System.out.println("O resto da ração após os cinco dias será de: " + totalfinal + " quilogramas");

sc.close();
	}
}
