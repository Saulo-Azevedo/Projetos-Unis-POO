/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraimc;

import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Saulo Azevedo
 */
public class CalculadoraImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Imc calc = new Imc();
        
        calc.peso = JOptionPane.showInputDialog(calc.peso);
        
      
                
        JOptionPane.showMessageDialog(null,"Dados do funcioanrio: " + r);
     
        
    }
    
}
