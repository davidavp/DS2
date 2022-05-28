package Lista00.q7;

import java.util.Scanner;

public class Losango {

    private double lado1, lado2, areaLosango;
    Scanner escreva = new Scanner(System.in);

    public Losango() {}

    public Losango(double lado1, double lado2, double areaLosango) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.areaLosango = areaLosango;
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

    public double getAreaLosango() {
        return areaLosango;
    }

    public void setAreaLosango(double areaLosango) {
        this.areaLosango = areaLosango;
    }

    public double calculoArea() {
        System.out.print("Informe a diagonal maior do losango: ");
        setLado1(escreva.nextDouble());

        System.out.print("Informe a diagonal menor do losango: ");
        setLado2(escreva.nextDouble());

        setAreaLosango((getLado1() * getLado2() / 2));
        System.out.println("A área do losango é: " + getAreaLosango());

        return 0;
    }
}
