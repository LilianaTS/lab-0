/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg0;

import java.util.Scanner;

/**
 *
 * @author Lili
 */
public class AppStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int orderNumber = 0;
        while (true) {
            
            Scanner scan = new Scanner (System.in);
            System.out.println("Escolha o tamanho da sua bebida");
            System.out.println ("S - Pequeno");
            System.out.println ("M - Médio");
            System.out.println ("L - Grande");
            System.out.println("E - exit");
            System.out.print("Tamanho: ");
            String tamanho = scan.next().toUpperCase();
            
            switch (tamanho) {
                case "S":
                    orderNumber+=1;
                    System.out.println("Name         : " + Size.SMALL);
                    System.out.println("toString()   : " + Size.SMALL.toString());
                    System.out.println("Ordem        : " + orderNumber);
                    System.out.println("Valor minimo : " + Size.SMALL.getMinValue());
                    System.out.println("Valor máximo : " + Size.SMALL.getMinValue());
                    System.out.println("Código       : " + Size.SMALL.getCode());
                    break;
                case "M":
                    orderNumber+=1;
                    System.out.println("Name         : " + Size.MEDIUM);
                    System.out.println("toString()   : " + Size.MEDIUM.toString());
                    System.out.println("Ordem        : " + orderNumber);
                    System.out.println("Valor minimo : " + Size.MEDIUM.getMinValue());
                    System.out.println("Valor máximo : " + Size.MEDIUM.getMinValue());
                    System.out.println("Código       : " + Size.MEDIUM.getCode());
                    break;
                case "L":
                    orderNumber+=1;
                    System.out.println("Name         : " + Size.LARGE);
                    System.out.println("toString()   : " + Size.LARGE.toString());
                    System.out.println("Ordem        : " + orderNumber);
                    System.out.println("Valor minimo : " + Size.LARGE.getMinValue());
                    System.out.println("Valor máximo : " + Size.LARGE.getMinValue());
                    System.out.println("Código       : " + Size.LARGE.getCode());
                    break;
                case "E":
                    return;
                default:
                    break;
            }
        }
        
    }
    
}
