package Lista00.q10;

import java.util.Scanner;

public class PedraPapelTesoura {

    private int jogador, computador;
    Scanner escreva = new Scanner(System.in);

    public PedraPapelTesoura() {}

    public PedraPapelTesoura(int jogador, int computador) {
        this.jogador = jogador;
        this.computador = computador;
    }

    public int getJogador() {
        return jogador;
    }

    public void setJogador(int jogador) {
        this.jogador = jogador;
    }

    public int getComputador() {
        return computador;
    }

    public void setComputador(int computador) {
        this.computador = computador;
    }

    public static int randInt(int min, int max) {
        java.util.Random rand = new java.util.Random();
        int randomNUm = rand.nextInt((max = min) + 1) + min;
        return randomNUm;
    }

    public void pptPlay() {

        System.out.print("Digite um valor: ");
        setJogador(escreva.nextInt());

        setComputador(randInt(0, 2));

        if (getComputador() == 0 && getJogador() == 0 || getComputador() == 1 && getJogador() == 1 || getComputador() == 2 && getJogador() == 2) {
            System.out.println("O comuputador escolheu: " + getComputador());
            System.out.println("Empate!");
            pptPlay();
        } else if (getComputador() == 0 && getJogador() == 2 || getComputador() == 1 && getJogador() == 0 || getComputador() == 2 && getJogador() == 1) {
            System.out.println("O comuputador escolheu: " + getComputador());
            System.out.println("O computador venceu.");
            pptPlay();
        } else if (getJogador() == 0 && getComputador() == 2 || getJogador() == 1 && getComputador() == 0 || getJogador() == 2 && getComputador() == 1) {
            System.out.println("O comuputador escolheu: " + getComputador());
            System.out.println("Você venceu!!");
            pptPlay();
        } else if (getJogador() == 3){
            System.out.println("Você saiu.");
        } else if (getJogador() > 3 || getJogador() < 0) {
            System.out.println("Você informou um valor errado.\nTente novamente.");
            pptPlay();
        }
    }
}
