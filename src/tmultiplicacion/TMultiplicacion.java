/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmultiplicacion;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TMultiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);    
        double res=0, num1,num2; 
        System.out.println("primer numero");
        num1=entrada.nextDouble();
        System.out.println("segundo numero");
        num2=entrada.nextDouble();
        
       for(double limite=num2;limite>0;limite--)
       {
          res=res+num1;
       }
        System.out.println(""+res);
       
        // TODO code application logic here
    }
    
}
