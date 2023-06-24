package aulas.aula11;

public class Contador01 {
    public static void main(String[] args) {
        // Estrutura de repetição com teste lógico no inicio

        int count = 0;

        while (count < 10) {
            count++;
            if (count == 2 || count == 3 || count == 4) {
                continue;
            }
            if (count == 7) {
                break;
            }
            System.out.println("cambalhota " + count);
        }

    }
}
