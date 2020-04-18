
package tabsystem40;

import java.util.Scanner;


public class Tabuada {
    
  // constructor:
    public Tabuada() {
        
    }
    
    public void pedirTabuada() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\n What is the multiplication table that you wan?");
        int novaTabuada = teclado.nextInt();
        
        gerarTabuada(novaTabuada);
    }
    
    public void gerarTabuada(int tabuada) {
     
                System.out.println("\n\n Multiplication table: " + tabuada);
                
                for ( int i = 1; i <= 10; i++ ) {
                    System.out.println(tabuada + " X " + i + " = " + (tabuada * i) );
                }
    }
    
  
    
    
    /*public void gerarTabuadas() {
        
        int t;
        int i;
        
        for ( t = 2; t <= 9; t++) {
                
                gerarTabuada(t);
                /*
                System.out.println("Tabuada de " + tabuada);
                
                for ( i = 1; i <= 10; i++ ) {
                    System.out.println(tabuada + " X " + i + " = " + (tabuada * i) );
                }
                
        }    */    
}

