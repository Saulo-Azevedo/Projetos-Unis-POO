/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unid5code1;

import javax.swing.*;

/**
 *
 * @author teksa
 */
public class Unid5Code1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declara x do tipo int
        int x;
        //Declara sx do tipo string
        String sx;
            // Faz a leitura e grava em sx
        sx = JOptionPane.showInputDialog("Digite o valor de x: ");
        // Converte sx (string)em inteiro        
        x = Integer.parseInt(sx);
        // Mostra o resultado na janela gráfica.
        JOptionPane.showMessageDialog(null,"Valor de x: "+ x);        
    }
    
}
