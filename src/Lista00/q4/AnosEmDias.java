package Lista00.q4;

import java.util.Scanner;

public class AnosEmDias {

    Scanner escreva = new Scanner(System.in);
    private int idade;
    private int ano;
    private int dias;

    public AnosEmDias() {}

    public AnosEmDias(int idade, int ano, int dias) {
        this.idade = idade;
        this.ano = ano;
        this.dias = dias;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int dias) {
        this.ano = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void calculo() {
        System.out.print("Qual sua idade: ");
        setIdade(escreva.nextInt());

        System.out.print("Qual dias tem o ano atual? Se o ano for bisexto, ponha '366'. : ");
        setAno(escreva.nextInt());

        setDias(getIdade() * getAno());

        System.out.print("Você já viveu: " + getDias() + " dias\n");
    }
}
