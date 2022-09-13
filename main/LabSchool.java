package projeto1v2.main;

import projeto1v2.menus.Menus;

import java.util.Scanner;

public class LabSchool {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("%n  # SEJA BEM VINDO A LAB SCHOOL #%n");
        System.out.printf("A escola de programação do FUTURO DEV%n");
        Menus.menuInicial(entrada);
        System.out.printf("%n### FIM DO PROGRAMA ###");
        System.out.printf("%n## LAB SCHOOL ##");
        System.out.printf("%nDesenvolvido por Luiz Felippe Antunes.%n");
        entrada.close();
    }
}