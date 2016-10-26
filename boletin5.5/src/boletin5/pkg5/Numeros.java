
package boletin5.pkg5;


public class Numeros {
    int num1;
    int num2;
    int num3;
    
    public Numeros(){
        
    }
    public Numeros(int n1, int n2, int n3){
        num1=n1;
        num2=n2;
        num3=n3;
    }
    
    public void comparar (int n1, int n2, int n3){
       if (n1>n2&&n1>n3)
           System.out.println("es mayor es"+n1);
          
       else if(n2>n1&&n2>n3)
            System.out.println("n2 es el mayor"+n2);
            
       else if (n3>n1 && n3>n2)
            System.out.println("n3 es el mayor"+n3);
       else System.out.println("los tres numeros son iguales");
           
}
}
