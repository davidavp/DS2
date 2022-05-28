package Lista00.q5;

import java.util.Scanner;

public class Triangulo {

    private double catOp, catAd, Hipo;
    Scanner escreva = new Scanner(System.in);

    public Triangulo() {}

    public Triangulo(double catOp, double catAd, double hipo) {
        this.catOp = catOp;
        this.catAd = catAd;
        Hipo = hipo;
    }

    public double getCatOp() {
        return catOp;
    }

    public void setCatOp(double catOp) {
        this.catOp = catOp;
    }

    public double getCatAd() {
        return catAd;
    }

    public void setCatAd(double catAd) {
        this.catAd = catAd;
    }

    public double getHipo() {
        return Hipo;
    }

    public void setHipo(double hipo) {
        Hipo = hipo;
    }

    public double calculoHipotenusa() {
        System.out.print("\nQual o valor do cateto oposto: ");
        setCatOp(escreva.nextDouble() * 2);

        System.out.print("\nQual o valor do cateto oposto: ");
        setCatAd(escreva.nextDouble());

        setHipo((getCatAd() * getCatAd()) + (getCatOp() * getCatOp()));

        System.out.print("\nO valor da hipotenusa é: ");
        System.out.println(getHipo());
        return 0;
    }
}
