package aulas.aula12;

import javax.swing.JOptionPane;

public class Contador03 {
    public static void main(String[] args) {
        int n, media, s = 0,numPar = 0,numImpar = 0, count = 0, acimaCem = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
            "<html>Informe um número: <br><em> (valor 0  interrompe)</em></html>"));
            s += n;
            count++;
            if (n % 2 == 0) {
                numPar++;
            }else{
                numImpar++;
            }

            if (n > 100){
                acimaCem++;
            }
            
            media = s / count;


        } while(n != 0);
        JOptionPane.showMessageDialog(null, 
        "<html>Resultado Final <br>--------------------" + 
        "<br>Total de Valores: " + count +
        "<br>Total de Pares: " + numPar +
        "<br>Total de Ímpares: " + numImpar +
        "<br>Acima de 100: " + acimaCem +
        "<br>Média dos Valores: " + media);
    
    }
}
