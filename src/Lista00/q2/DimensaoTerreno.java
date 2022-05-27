package Lista00.q2;

import java.util.Scanner;

/**
 * Uma imobiliária vende apenas terrenos retangulares. Faça um programa em java para
 * ler as dimensões de um terreno e depois exibir a área do terreno. (lado x altura)
 **/

public class DimensaoTerreno {

    private double lado, altura, area;
    Scanner escreva = new Scanner(System.in);

    public DimensaoTerreno() {}

    public DimensaoTerreno(double lado, double altura, double area) {
        setLado(lado);
        setAltura(altura);
        setArea(area);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double areaTerreno() {

        System.out.print("Qual o lado do terreno: ");
        setLado(escreva.nextDouble());

        System.out.print("Qual a altura do terreno: ");
        setAltura(escreva.nextDouble());

        setArea(getLado() * getAltura());

        System.out.print("\nA área do terreno é: ");

        return area;
    }
}
