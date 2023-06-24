package aulas.aula12;

import java.util.Scanner;

public class Contador02 {
    public static void main(String[] args) {
        // Estrutura de repetição com teste lógico no final

        int numero, soma = 0;
        String resposta;


        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Digite uma número: ");
            numero = scan.nextInt();
            soma += numero;
            System.out.print("Quer continuar? [S/N]");
            resposta = scan.next();
        } while (resposta.equals("S"));

        System.out.println("A somade todos os valore é: " + soma);
        
    }
}
