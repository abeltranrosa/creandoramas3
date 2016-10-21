
package boletin5.pkg3;
    
public class Resultado {
    private int num1;
    
    public Resultado(){
        
    }
    public Resultado(int n1){
        num1 = n1;
    }
    public void compara (int n1){
          if (n1>0)
            System.out.println(n1 + "el signo es: +");
        else if (n1<0)
            System.out.println(n1 + "el signo es: -"); 
        else 
            System.out.println(n1 + "el resultado es: 0"); 
    }
}
