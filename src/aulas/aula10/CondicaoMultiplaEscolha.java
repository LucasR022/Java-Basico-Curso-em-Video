package aulas.aula10;

import java.util.Scanner;

public class CondicaoMultiplaEscolha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Você tem quantas pernas?: ");
        int pernas = scan.nextInt();
        String tipo;

        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }

        System.out.println(tipo);
    }
}
