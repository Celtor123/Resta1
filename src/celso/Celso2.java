/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celso;

import java.util.Scanner;

/**
 *
 * @author oracle
 */
public class Celso2 {
    
    
    
    public static void main(String[] args) {
        
    
    Scanner resta= new Scanner(System.in);
        int num3,num4,resultado1;
        System.out.println("Por favor, ingresa el primer número");
        num3= resta.nextInt();
        System.out.println("Por favor, ingresa el segundo número");
        num4= resta.nextInt();
        resultado1= num3 - num4;
        System.out.println("La resta de ambos números es "+ resultado1);
                }
}
