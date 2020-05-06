/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilderproject;

/**
 *
 * @author Luis Santos
 */
public class StringBuilderProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // apend method add 
        StringBuilder sb = new StringBuilder("Start");
        sb.append("+ middle"); // add term " + midle "
        StringBuilder same = sb.append(" + end"); // add term " + end "

        System.out.println(same);
        // output of "same" string builder is equals to "sb"(start + middle) and add "same" (+ end)

        System.out.println("Another example ");
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");// reference "b" is the same that reference "a"
        // now no matter if y put in the script reference a or b , is equals
     
        b = b.append("f").append("g"); // lets add more two letters
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
    
}
