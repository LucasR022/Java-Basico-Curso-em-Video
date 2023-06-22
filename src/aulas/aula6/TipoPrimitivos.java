package aulas.aula6;

import java.util.Scanner;

public class TipoPrimitivos {
    public static void main(String[] args) throws Exception {

        // Tipo Primitivos

        // Lógicos (verdadeiro ou falso)
        boolean v = true;

        // Literias
        char letra = 'L';
        String nome = "Lucas";

        // Inteiros
        byte b = 127; // (Suporta 127 numeros)
        short s = 30000;
        int i = 20000000;
        long l  = 1000000000;

        // Reais
        float f = 2.5f;
        double d = 2.5;

        
        // 3 maneiras básicas de declarar variáveis em java: 
       
        float nota = 8.5f; 

        int idade = (int) 3; // typecast (Expecificar o tipo)

        Integer idade2 = new Integer(5); // Declarando um objeto

        // Tipos de saída de dados

        System.out.print("Letra "+ letra); // Imprimi na tela 
        System.out.println("Nome: " + nome); //Imprimi e depois pula para proxima linha
        System.out.printf("Nome s% nota f.3%",  nome, f ); // Formata a saída dos dados.
        System.out.format("Nome s% nota f.3%",  nome, f); // Formata a saída dos dados.

        // Entrada de Dados

        // importar a classe Scanner

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String n = scan.nextLine();


        




        
    }
}
