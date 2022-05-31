package Lista00.q12;

import java.util.Scanner;

public class PesoPessoaPlanetas {
    private int planeta;
    private double peso, calculoPesoPlaneta;
    Scanner escreva = new Scanner(System.in);

    public PesoPessoaPlanetas() {}

    public PesoPessoaPlanetas(int planeta, double peso, double calculoPesoPlaneta) {
        this.planeta = planeta;
        this.peso = peso;
        this.calculoPesoPlaneta = calculoPesoPlaneta;
    }

    public int getPlaneta() {
        return planeta;
    }

    public void setPlaneta(int planeta) {
        this.planeta = planeta;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCalculoPesoPlaneta() {
        return calculoPesoPlaneta;
    }

    public void setCalculoPesoPlaneta(double calculoPesoPlaneta) {
        this.calculoPesoPlaneta = calculoPesoPlaneta;
    }

    public void calculoPesoPessoaPlaneta() {
        System.out.print("Qual seu peso: ");
        setPeso(escreva.nextDouble());

        System.out.print("\n1 - Mercúrio\t" +
                "2 - Vênus\t" +
                "3 - Marte\t" +
                "4 - Júpiter\t" +
                "5 - Saturno\t" +
                "6 - Urano" +
                "\nEscolha o Plneta que quer saber seu peso: ");
        setPlaneta(escreva.nextInt());

        if (getPlaneta() == 1) {
            setCalculoPesoPlaneta(getPeso() * 0.37);
            System.out.print("\nSeu peso em Mercúrio seria de: " + getCalculoPesoPlaneta());
        } else if (getPlaneta() == 2) {
            setCalculoPesoPlaneta(getPeso() * 0.88);
            System.out.print("\nSeu peso em Vênus seria de: " + getCalculoPesoPlaneta());
        } else if (getPlaneta() == 3) {
            setCalculoPesoPlaneta(getPeso() * 0.38);
            System.out.print("\nSeu peso em Marte seria de: " + getCalculoPesoPlaneta());
        } else if (getPlaneta() == 4) {
            setCalculoPesoPlaneta(getPeso() * 2.64);
            System.out.print("\nSeu peso em Júpiter seria de: " + getCalculoPesoPlaneta());
        } else if (getPlaneta() == 5) {
            setCalculoPesoPlaneta(getPeso() * 1.15);
            System.out.print("\nSeu peso em Saturno seria de: " + getCalculoPesoPlaneta());
        } else if (getPlaneta() == 6) {
            setCalculoPesoPlaneta(getPeso() * 1.17);
            System.out.print("\nSeu peso em Urano seria de: " + getCalculoPesoPlaneta());
        }
    }
}
