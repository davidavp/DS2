package Lista00.q6;

import java.util.Scanner;

public class SalarioFuncionario {

    private int salario, salaFunc, totalSala;
    Scanner escreva = new Scanner(System.in);

    public SalarioFuncionario() {}

    public SalarioFuncionario(int salario, int salaFunc) {
        setSalario(salario);
        setSalaFunc(salaFunc);
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalaFunc() {
        return salaFunc;
    }

    public void setSalaFunc(int salaFunc) {
        this.salaFunc = salaFunc;
    }

    public int getTotalSala() {
        return totalSala;
    }

    public void setTotalSala(int totalSala) {
        this.totalSala = totalSala;
    }

    public int qtdSalaraio() {
        System.out.print("Qual o valor do salário mínimo atual: ");
        setSalario(escreva.nextInt());

        System.out.print("Qual o seu salário: ");
        setSalaFunc(escreva.nextInt());

        setTotalSala(getSalaFunc() / getSalario());

        System.out.print("Você recebe: " + getTotalSala() + " a mais");

        return 0;
    }
}
