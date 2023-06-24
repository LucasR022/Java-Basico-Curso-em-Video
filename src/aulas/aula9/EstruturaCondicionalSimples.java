package aulas.aula9;

import java.util.Scanner;

public class EstruturaCondicionalSimples {
    public static void main(String[] args) {
        
        // Estrutura Condicional Simples
        
        Scanner scan = new Scanner(System.in);

        float n1 = scan.nextFloat();
        float n2 = scan.nextFloat();
        float m = (n1 + n2) / 2;

        System.out.println("A sua média é: " + m);

        if (m>9) {
            System.out.println("Parabens!");
        }

        

        

        


    }
}
