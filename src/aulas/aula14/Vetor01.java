package aulas.aula14;

public class Vetor01 {
    public static void main(String[] args) {
        int[] n = {3,2,8,7,5,4};

        System.out.println("O número de casas do vetor N é: " + n.length);

        for (int i = 0; i <= n.length-1; i++) {
            System.out.println("Na posição " + i + " Temos o valor: " + n[i] + " ");
        }
    }
}
