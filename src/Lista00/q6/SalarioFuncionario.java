package Lista00.q6;

import java.util.Scanner;

public class SalarioFuncionario {

    private double salario, salaFunc, totalSala;
    Scanner escreva = new Scanner(System.in);

    public SalarioFuncionario() {}

    public SalarioFuncionario(double salario, double salaFunc, double totalSala) {
        setSalario(salario);
        setSalaFunc(salaFunc);
        setTotalSala(totalSala);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalaFunc() {
        return salaFunc;
    }

    public void setSalaFunc(double salaFunc) {
        this.salaFunc = salaFunc;
    }

    public double getTotalSala() {
        return totalSala;
    }

    public void setTotalSala(double totalSala) {
        this.totalSala = totalSala;
    }

    public double qtdSalaraio() {
        System.out.print("Qual o valor do salário mínimo atual: ");
        setSalario(escreva.nextInt());

        System.out.print("Qual o seu salário: ");
        setSalaFunc(escreva.nextInt());

        setTotalSala(getSalaFunc() / getSalario());

        System.out.print("Você recebe: " + getTotalSala() + " a mais");

        return 0;
    }
}
