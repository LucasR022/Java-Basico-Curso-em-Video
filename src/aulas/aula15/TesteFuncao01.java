package aulas.aula15;

public class TesteFuncao01 {

    static int soma (int a, int b) {
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
       int sm = soma(5, 7);
       System.out.println(sm);
    }
}
