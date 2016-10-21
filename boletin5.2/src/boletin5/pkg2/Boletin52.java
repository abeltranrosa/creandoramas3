
package boletin5.pkg2;

import javax.swing.JOptionPane;


public class Boletin52 {

    
    public static void main(String[] args) {
        short n1 = Short.parseShort(JOptionPane.showInputDialog("introduce numero"));
        short n2 = Short.parseShort(JOptionPane.showInputDialog("introduce numero"));
        Suma obxSuma = new Suma();
        obxSuma.comparar(n1, n2);
    }
    
}
