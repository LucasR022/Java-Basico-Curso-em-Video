package aulas.aula6;

public class TesteTipos {
    public static void main(String[] args) {
        // resolvendo incompatibilidade de tipos.
        
        /* int idade = 30;
        String valor = Integer.toString(idade);

        System.out.println(valor); */


        String valor = "30";

        int idade = Integer.parseInt(valor);

        System.out.println(idade);

    }
}
