package aulas.aula14;

import java.util.Arrays;

public class Vetor05 {
    public static void main(String[] args) {
        int[] v = new int[20];

       /*  for (int i : v) {
            v[i] = 0;
        }

        for (int i : v) {
            System.out.print(i + " ");
        } */

        Arrays.fill(v, 0);
        
        for (int i : v) {
        System.out.print(i + " ");
        }
    }
}
