/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplorepeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author robso
 */
public class ExemploRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, contador = 0, pares = 0, impares = 0, cem = 0, media = 0;
        do {
            
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número(Valor 0 interrompe.)"));
            if (n == 0) {
                break;
            }
            s += n;
            contador++;
            media = s/contador;
            if (n % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            if (n > 100) {
                cem++;
            }
        } while (n != 0);
        JOptionPane.showMessageDialog(null, 
         "Resultado"
        +"\n______________________"
        +"\nTotal de Valores: " + contador
        +"\nTotal de Pares: " + pares
        +"\nTotal de Impares:  " + impares
        +"\nAcima de 100: " + cem
        +"\nMédia dos valores: " + media);
    }
}
