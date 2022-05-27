package Lista00.q2;

import java.util.Scanner;

/**
 * Uma imobiliária vende apenas terrenos retangulares. Faça um programa em java para
 * ler as dimensões de um terreno e depois exibir a área do terreno. (lado x altura)
 **/

public class DimensaoTerreno {
    public static double areaTerreno() {

        Scanner escreva = new Scanner(System.in);

        System.out.print("Qual o lado do terreno: ");
        double lado = escreva.nextDouble();

        System.out.print("Qual a altura do terreno: ");
        double altura = escreva.nextDouble();

        double area = lado * altura;

        System.out.print("\nA área do terreno é: ");

        return area;
    }
}
