package Lista00.q13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListarNumeros {

    private int limiteSuperior, limiteInferior;
    Scanner escreva = new Scanner(System.in);

    public ListarNumeros() {}

    public ListarNumeros(int limiteSuperior, int limiteInferior) {
        this.limiteSuperior = limiteSuperior;
        this.limiteInferior = limiteInferior;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(int limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public int getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(int limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public int calculoSomaInteiros() {
        int soma = 0;
        int limite_Inferior;

        limite_Inferior = getLimiteInferior();

        while (limite_Inferior < getLimiteSuperior()) {
            soma += limite_Inferior;
        }
        return soma;
    }

    public int calculoIntervaloInteiro() {
        int i = 0;
        int limiteInferior;

        limiteInferior = getLimiteInferior();

        while (limiteInferior < getLimiteSuperior()) {
            limiteInferior++;
            i++;
        }
        return i;
    }

    public List<List<Integer>> calculoParEImpar() {
        List<List<Integer>> lista = new ArrayList<>();
        List<Integer> listaIntPar = new ArrayList<>();
        List<Integer> listaIntImpar = new ArrayList<>();

        int limiteInferior;
        limiteInferior = getLimiteInferior();

        while (limiteInferior < getLimiteSuperior()) {
            if (limiteInferior % 2 == 0) {
                listaIntPar.add(limiteInferior);
            } else {
                listaIntImpar.add(limiteInferior);
            }
            limiteInferior++;
        }
        lista.add(listaIntPar);
        lista.add(listaIntImpar);

        return lista;
    }
}
