
package boletin5.pkg3;

import javax.swing.JOptionPane;


public class Boletin53 {

   
    public static void main(String[] args) {
        int n1= Integer.parseInt(JOptionPane.showInputDialog("introduce numero"));
        Resultado obxResultado = new Resultado();
        obxResultado.compara(n1); 
    }
    
}
