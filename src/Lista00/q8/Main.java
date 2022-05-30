package Lista00.q8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner escreva = new Scanner(System.in);
        DistanciaPontos d1 = new DistanciaPontos();

        System.out.println("Digite a localização dos 1º pontos: ");
        System.out.print("Ponto X1: ");
        d1.setX1(escreva.nextDouble());

        System.out.print("Ponto Y1: ");
        d1.setY1(escreva.nextDouble());

        System.out.println("Digite a localização dos 2º pontos: ");
        System.out.print("Ponto X2: ");
        d1.setX2(escreva.nextDouble());

        System.out.println("Ponto Y2: ");
        d1.setY2(escreva.nextDouble());

        System.out.println("A distância entre os pontos 1 e 2 é: " + d1.calculoDistancia());

        escreva.close();
    }
}
