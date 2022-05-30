package Lista00.q9;

import java.util.Scanner;

public class TipoTriangulo {

    private double lado1, lado2, lado3;
    Scanner escreva = new Scanner(System.in);

    public TipoTriangulo() {}

    public TipoTriangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public void modeloTruangulo() {
        System.out.print("Informe o 1º lado do triângulo: ");
        setLado1(escreva.nextDouble());

        System.out.print("Informe o 2º lado do triângulo: ");
        setLado2(escreva.nextDouble());

        System.out.print("Informe o 3º lado do triângulo: ");
        setLado3(escreva.nextDouble());

        if (getLado1() == getLado2() && getLado1() == getLado3() || getLado2() == getLado1() && getLado2() == getLado3() || getLado3() == getLado1() && getLado3() == getLado2()) {
            System.out.println("O triangulo é Equilátero.");
        } else if(getLado1() == getLado2() && getLado1() != getLado3() || getLado1() == getLado3() && getLado1() != getLado2() || getLado2() == getLado1() && getLado2() != getLado3() || getLado2() == getLado3() && getLado2() != getLado1() || getLado3() == getLado1() && getLado3() != getLado2() || getLado3() == getLado2() && getLado3() != getLado1()) {
            System.out.println("O triangulo é Isósceles.");
        } else {
            System.out.println("O triangulo é Escaleno");
        }
    }
}
