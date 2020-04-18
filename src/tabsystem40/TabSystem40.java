/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabsystem40;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TabSystem40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tabuada t = new Tabuada();
        t.pedirTabuada();
        t.gerarTabuada(2);
       
       
        
//        Tabuada t = new Tabuada();
//        
//        t.gerarTabuadas();
//        
//        t.gerarTabuada(5);
//        t.gerarTabuada(9);
        
        

        // mundo exterior
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("\nQual a tabuada?");
//        int novaTabuada = teclado.nextInt();
//        t.gerarTabuada(novaTabuada);
        
        
        // ou a própria classe sabe fazer...
//        t.pedirTabuada();
    }
    
}