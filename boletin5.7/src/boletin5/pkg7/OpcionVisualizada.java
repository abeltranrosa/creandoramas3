
package boletin5.pkg7;
   
import javax.swing.JOptionPane;

public class OpcionVisualizada {
       private String cuadrado;
       private String triangulo;
       private String circulo;
       
       public OpcionVisualizada(){
           
       }
       public OpcionVisualizada(String cuadrado, String triangulo, String circulo){
           this.circulo=circulo;
           this.cuadrado=cuadrado;
           this.triangulo=triangulo;
           
           }
       public void menu (){
           String opcion=(JOptionPane.showInputDialog("elige opcion:cuadrado, triangulo,circulo"));
           double area;
           switch (opcion){
               case "cuadrado":
                   float lado=Float.parseFloat(JOptionPane.showInputDialog("base"));
                   area= lado*lado;
                   JOptionPane.showMessageDialog(null,"area ="+ area);
                   break;
               case "triangulo":
                   float base=Float.parseFloat(JOptionPane.showInputDialog("base"));
                   float altura=Float.parseFloat(JOptionPane.showInputDialog("altura"));
                   area = base*altura/2;
                   JOptionPane.showMessageDialog(null,"area =" + area);
                   break;
               case "circulo":
                   double radio=Double.parseDouble(JOptionPane.showInputDialog("radio"));
                   final double PI = 3.14f;
                   area = PI*Math.pow(radio, 2);
               default: System.out.println("opcion incorrecta");
       }
       
    
       }
}
