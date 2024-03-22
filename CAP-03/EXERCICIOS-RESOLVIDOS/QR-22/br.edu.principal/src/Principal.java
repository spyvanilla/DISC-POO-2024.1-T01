package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vlr_sal = scanner.nextDouble();
        double qtd_kw = scanner.nextDouble();

        double vlr_kw = vlr_sal / 5;
        double vlr_reais = vlr_kw * qtd_kw;
        double desc = vlr_reais * 15 / 100;
        double vlr_desc = vlr_reais - desc;

        System.out.println(vlr_kw);
        System.out.println(vlr_reais);
        System.out.println(vlr_desc);
    }
}