/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unid5codec;

import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author teksa
 */
public class Unid5Codec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        int a;
//        a=2;
//        if (a >3) {
//            System.out.println("0 a é maior que 3 ");
//        }else{
//            System.out.println("O a é menor que 3");
//        }
        
        String opcao,op;
        op =JOptionPane.showInputDialog("Informe qual opçao: ");
        opcao =DatatypeConverter.parseString(op);
        
        switch(opcao){
            case  "Aluno":
                System.out.println(" O tipo da opcao é Aluno");
                JOptionPane.showMessageDialog(null,"O tipo de opção é "+ op);
                break;
            case "professor":
                System.out.println("O tipo de opçcao é Professor.");
                JOptionPane.showMessageDialog(null,"O tipo de opção é "+ op);
                break;
            case "secretaria":
                System.out.println("O tipo de de opção é secretaria.");
                JOptionPane.showMessageDialog(null,"O tipo de opção é "+ op);
                break;
            default:
                System.out.println("O tipo de de opção desconhecida.");
                JOptionPane.showMessageDialog(null,"O tipo de opção" + " é desconhecida ");
            
        }
    }
    
}
