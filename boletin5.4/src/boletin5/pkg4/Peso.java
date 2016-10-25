
package boletin5.pkg4;

import javax.swing.JOptionPane;


public class Peso {
    private String nombre1, nombre2;
    private float peso1, peso2;
    
    public Peso(){
        
    }
    public Peso(float p1, float p2, String n1, String n2){
      this.peso1= p1;
      this.peso2= p2; 
      this.nombre1=n1;
      this.nombre2=n2;
    }
    public void comparar (float p1, float p2, String n1, String n2){
       
        
        if (p1>p2)
            System.out.println(n1 + "la diferencia de peso es:"+(p1-p2));
        else if (p2>p1) 
                System.out.println(n2+"la diferencia de peso es:"+(p2-p1));
        else 
            System.out.println("pesan lo mismo");
        
    }
}
