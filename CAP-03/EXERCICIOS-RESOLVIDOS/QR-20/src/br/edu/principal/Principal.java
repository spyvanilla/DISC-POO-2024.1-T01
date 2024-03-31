package br.edu.principal;

import java.util.Scanner;

public class Principal {
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			
System.out.println("Qual a medida do ângulo?");
int medang = sc.nextInt();
System.out.println("Qual a altura da parede em metros?");
float altpar = sc.nextFloat();

double rad = (medang * Math.PI / 180);
double escada = (altpar / Math.sin(rad));

System.out.println("A medida da escada é: " + escada);

sc.close();
		}
}
