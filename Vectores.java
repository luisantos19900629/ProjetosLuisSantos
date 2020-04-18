/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.ArrayList;


public class Vectores {

    public static void main(String[] args) {
     
    double notas[] = {12.5,17.3,9.9,15.6,18.1};    
        
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
        System.out.println(notas[3]);
        System.out.println(notas[4]);
     
    // ArrayList: Brands Cars , we can use methods like add, remove ...
    
    String carsBrand;
     
    ArrayList carsbrand = new ArrayList();
    carsbrand.add("Audi");
    carsbrand.add("Ford");
    carsbrand.add("Fiat");   
    carsbrand.add("Mazda");    
        
        System.out.println("Marcas: " + carsbrand);  
        
       carsbrand.remove(3);
        System.out.println("Removido item");
        System.out.println(carsbrand);
        
        
    }    
}
