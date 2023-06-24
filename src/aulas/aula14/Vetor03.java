package aulas.aula14;

import java.util.Arrays;

public class Vetor03 {
    public static void main(String[] args) {
        // Mostrando o vetor
        
        double[] v = {3.5, 2.75, 9, -4.5};

        for (double valor : v ) {
            System.out.print(valor + " ");
        }

        // Colocando o vetor em ordem

        Arrays.sort(v);
        System.out.println();
        for (double valor : v ) {
            System.out.print(valor + " ");
        }

    }
}
