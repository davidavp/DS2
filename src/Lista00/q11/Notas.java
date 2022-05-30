package Lista00.q11;

import java.util.Scanner;

public class Notas {

    private double nota1, nota2, nota3, media;
    Scanner escreva = new Scanner(System.in);

    public Notas() {
    }

    public Notas(double nota1, double nota2, double nota3, double media) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void media1() {
        System.out.print("Insira aqui sua primeira nota: ");
        setNota1(escreva.nextDouble());

        System.out.print("Insira aqui sua segunda nota: ");
        setNota2(escreva.nextDouble());

        if (getNota1() > 5 && getNota2() > 3 || getNota2() > 5 && getNota1() > 3) {
            setMedia(getNota1() + getNota2() / 2);
            System.out.println("Aluno aprovado por média.");
        } else {
            System.out.println("Você está na final.");
            mediaFinal();
        }
    }

    public void mediaFinal() {
        System.out.print("Informe a nota da prova final: ");
        setNota3(escreva.nextDouble());

        Math.max(getNota1(), getNota2());
        this.setMedia(getNota1() + getNota3() / 2);

        if (this.getMedia() > 5) {
            System.out.println("Aluno aprovado na final");
            System.out.println(this.getMedia());
        } else {
            System.out.println("Aluno Reprovado.");
        }
    }
}
