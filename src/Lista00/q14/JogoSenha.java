package Lista00.q14;

import java.util.Scanner;

public class JogoSenha {
    private int tentativas;
    private int jogador1, jogador2;
    private boolean achou;

    private String jogarNovamente;
    Scanner escreva = new Scanner(System.in);

    public JogoSenha() {}

    public JogoSenha(int tentativas, int jogador1, int jogador2, boolean achou, String jogarNovamente) {
        setTentativas(tentativas);
        setJogador1(jogador1);
        setJogador2(jogador2);
        setAchou(achou);
        setJogarNovamente(jogarNovamente);
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public int getJogador1() {
        return jogador1;
    }

    public void setJogador1(int jogador1) {
        this.jogador1 = jogador1;
    }

    public int getJogador2() {
        return jogador2;
    }

    public void setJogador2(int jogador2) {
        this.jogador2 = jogador2;
    }

    public boolean getAchou() {
        return achou;
    }

    public void setAchou(boolean achou) {
        this.achou = achou;
    }

    public String getJogarNovamente() {
        return jogarNovamente;
    }

    public void setJogarNovamente(String jogarNovamente) {
        this.jogarNovamente = jogarNovamente;
    }

    public void startGame() {
        System.out.print("\nJogador 1.\nDigite o número a ser descoberto: ");
        setJogador1(escreva.nextInt());

        setTentativas(5);

        if (getJogador1() > 100 || getJogador1() < 0) {
            System.out.println("Limite excedido.");
        } else {
            while (getTentativas() > 0 && !getAchou()) {
                System.out.print("\nJogador 2.\nAdvinhe o número: ");
                setJogador2(escreva.nextInt());

                if (getJogador1() == getJogador2()) {
                    System.out.println("\nVocê acertou!");
                    setAchou(true);
                } else if (getJogador1() < getJogador2()) {
                    setTentativas(getTentativas() - 1);
                    System.out.println("\nO número é maior.\n" + getTentativas() + " Tentativas restantes.");
                } else {
                    setTentativas(getTentativas() - 1);
                    System.out.println("\nO número é maior.\n" + getTentativas() + " Tentativas restantes.");
                }
            }
            if (getTentativas() == 0) {
                System.out.println("O número de tentativas acabou! Você perdeu.");
            }
        }
        if (getJogador2() == getJogador1() + 1 || getJogador2() == getJogador1() - 1) {
            System.out.println("Você está quente!");
        }
        System.out.println("Deseja jogar de novo?");
        setJogarNovamente(escreva.nextLine());

        if (getJogarNovamente().equals("s") || getJogarNovamente().equals("S")) {
            System.out.println("Boa sorte!");
            startGame();
        } else {
            System.out.println("Até a próxima.");
        }
    }
}
