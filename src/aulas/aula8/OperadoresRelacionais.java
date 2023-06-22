package aulas.aula8;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        
        // Comparação de String

        String nome1 = "Lucas";
        String nome2 = "Lucas";
        String nome3 = new String("Lucas");
        String resultado;

        resultado = (nome1 == nome2) ? "igual" : "difirente";

        System.out.println(resultado);

        resultado = (nome2.equals(nome3)) ? "igual" : "diferente";

        System.out.println(resultado);
 

    }       
}
