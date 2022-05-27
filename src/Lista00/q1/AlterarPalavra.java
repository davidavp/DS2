package Lista00.q1;

import java.util.Scanner;

    /**
    Construa uma classe que solicite uma frase escrita pelo usuário. Peça ao usuário para
    escolher uma palavra da frase escrita e substituí-la por outra palavra. (Utilize o método
    replace()).
    **/

public class AlterarPalavra {

    private String frase, palavraEscolhida, palavraSubstituta, novaFrase;
    Scanner escreva = new Scanner(System.in);

    public AlterarPalavra() {
        setFrase(frase);
        setPalavraEscolhida(palavraEscolhida);
        setPalavraSubstituta(palavraSubstituta);
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPalavraEscolhida() {
        return palavraEscolhida;
    }

    public void setPalavraEscolhida(String palavraEscolhida) {
        this.palavraEscolhida = palavraEscolhida;
    }

    public String getPalavraSubstituta() {
        return palavraSubstituta;
    }

    public void setPalavraSubstituta(String palavraSubstituta) {
        this.palavraSubstituta = palavraSubstituta;
    }

    public String getNovaFrase() {
        return novaFrase;
    }

        public void setNovaFrase(String novaFrase) {
            this.novaFrase = novaFrase;
        }

    public void mudarPalavra() {

        System.out.print("Escreva a nova frase: ");
        setFrase(escreva.nextLine());

        System.out.print("Escolha a palavra para mudar: ");
        setPalavraEscolhida(escreva.nextLine());

        System.out.print("Digite a palavra substituta: ");
        setPalavraSubstituta(escreva.nextLine());

        System.out.print("\nA nova frase é: ");
        setNovaFrase(getFrase().replaceAll(getPalavraEscolhida(), getPalavraSubstituta()));

        System.out.print("\nA frase era: " + getFrase());
        System.out.print("\nA frase ficou: " + novaFrase);
    }
}
