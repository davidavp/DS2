package Lista00.q3;

import java.util.Scanner;

/**
 * Faça um programa em java para calcular quantas ferraduras são necessárias para
 * equipar todos os cavalos comprados para um haras. A informação de cavalos
 * comprados deve ser informada pelo usuário.
 **/

public class CavalosEFerraduras {

    private int numCavalos, ferraduras;
    Scanner escreva = new Scanner(System.in);

    public CavalosEFerraduras() {}

    public CavalosEFerraduras(int numCavalos, int ferraduras) {
        setNumCavalos(numCavalos);
        setFerraduras(ferraduras);
    }

    public int getFerraduras() {
        return ferraduras;
    }

    public void setFerraduras(int ferraduras) {
        this.ferraduras = ferraduras;
    }

    public int getNumCavalos() {
        return numCavalos;
    }

    public void setNumCavalos(int numCavalos) {
        this.numCavalos = numCavalos;
    }

    public int calculoFerraduras() {
        System.out.print("Quantos cavalos existem no local: ");
        setNumCavalos(escreva.nextInt());

        System.out.print("O número de ferraduras é: ");
        setFerraduras(getNumCavalos() * 4);

        System.out.println(getFerraduras());

        return getFerraduras();
    }
}
