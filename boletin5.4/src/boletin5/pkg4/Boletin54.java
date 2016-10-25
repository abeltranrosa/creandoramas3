
package boletin5.pkg4;

import javax.swing.JOptionPane;


public class Boletin54 {

    
    public static void main(String[] args) {
      String  n1=JOptionPane.showInputDialog("introduce nombre 1");
      String  n2=JOptionPane.showInputDialog("introduce nombre 2");
      float p1= Float.parseFloat(JOptionPane.showInputDialog("introduce peso1"));
      float p2= Float.parseFloat(JOptionPane.showInputDialog("introduce peso2"));
      Peso pes1 = new Peso();
      pes1.comparar(p1, p2, n1, n2);
             
    }
    
}
