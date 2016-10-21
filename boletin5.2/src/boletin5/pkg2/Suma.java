
package boletin5.pkg2;


public class Suma {
    private short num1;
    private short num2;
    
    public Suma(){
        
    }
    public Suma(short num1, short num2){
        this.num1 = num1;
        this.num2 = num2;
        
    }
    public void comparar (short n1, short n2){
        if(n1>=n2)
            System.out.println("resta="+ (n1-n2)+("suma=" + (n1+n2)));
        else 
            System.out.println("suma" + (n1+n2));
        System.out.println("adios"); 
    }
        
    
}
    

