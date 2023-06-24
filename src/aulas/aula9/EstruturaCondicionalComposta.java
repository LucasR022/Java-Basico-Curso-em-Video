package aulas.aula9;

import java.util.Scanner;

public class EstruturaCondicionalComposta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Em que ano você nasceu?: ");
        int nascimento = scan.nextInt();
        int idade = 2023 - nascimento;

        if (idade > 18) {
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade!");
        }
    }
}
