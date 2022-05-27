package Lista00.q1;

import java.util.Scanner;

    /**
    Construa uma classe que solicite uma frase escrita pelo usuário. Peça ao usuário para
    escolher uma palavra da frase escrita e substituí-la por outra palavra. (Utilize o método
    replace()).
    **/

public class AlterarPalavra {
    public void mudarpalavra() {

        Scanner escreva = new Scanner(System.in);

        System.out.print("Escoreva a frase: ");
        String frase = escreva.nextLine();

        System.out.print("Escolha uma palavra da frase para mudar: ");
        String palavraEscolhida = escreva.nextLine();

        System.out.print("Escolha a nova palavra: ");
        String palavraSubstituta = escreva.nextLine();

        String novaFrase = frase.replaceAll(palavraEscolhida, palavraSubstituta);

        System.out.println("A frase era: " + frase);
        System.out.println("A frase ficou: " + novaFrase);
    }
}
