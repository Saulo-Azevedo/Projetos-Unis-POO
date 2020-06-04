/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unid5coded;

import java.util.Random;

/**
 *
 * @author teksa
 */
public class Unid5Coded {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       int quantidade = 50; 
       int sorteado = 0;
       Random sorteio = new Random();
                     
       while (quantidade>0){
           sorteado = sorteio.nextInt(100)+1;
           if (sorteado == 13){
               System.out.println("Bingo");
               quantidade = 0;
               System.out.println("Qtd Zerado.");
           }
           quantidade--;
       }
        System.out.println("Fim do lupe.");
    }
    
}
