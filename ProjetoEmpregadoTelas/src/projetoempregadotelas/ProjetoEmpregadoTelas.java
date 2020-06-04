/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoempregadotelas;

import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author teksa
 */
public class ProjetoEmpregadoTelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String nom,sobre;
        String nome,sobrenome;
        int matr;
        
        Empregado func = new Empregado();
        

func.nome = JOptionPane.showInputDialog("informe nome do funcionario: ");
func.sobrenome = JOptionPane.showInputDialog("Informe Sobrenome: ");
func.matricula = JOptionPane.showInputDialog("Informe a matricula : ");

matr = Integer.parseInt(func.matricula);
nom = DatatypeConverter.parseString(func.nome);
sobre = DatatypeConverter.parseString(func.sobrenome);

JOptionPane.showMessageDialog(null,"Dados do funcioanrio: "+ matr + nom + " "+ sobre);

    


    }
    
}
