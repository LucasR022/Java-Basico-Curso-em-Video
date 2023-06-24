package aulas.aula10;

import java.util.Scanner;

public class CondicaoCompostaEncadeada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quando você nasceu?: ");
        int nascimento = scan.nextInt();
        int idade = 2023 - nascimento;

        System.out.print("A sua idade é " + idade + " anos ");

        if (idade < 16) {
            System.out.println("Não vota");
        } else if ((idade >= 16 && idade < 18) || (idade > 70))
            System.out.println("Voto Opcional");
            else {
                System.out.println("Voto obrigatório");
            }
            
        
    }
}
