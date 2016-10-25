
package boletin.pkg5.pkg6;

import javax.swing.JOptionPane;


public class Boletin56 {

    
    public static void main(String[] args) {
        Almacen almacen1=new Almacen();
        double n1=Double.parseDouble(JOptionPane.showInputDialog("Introduzca o número de artigos vendidos"));
        almacen1.amosar(n1);
    }
    
}
