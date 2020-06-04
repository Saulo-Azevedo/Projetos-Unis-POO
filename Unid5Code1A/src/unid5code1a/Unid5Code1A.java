/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unid5code1a;

/**
 *
 * @author teksa
 */
public class Unid5Code1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empregado func = new Empregado();
        
        func.matricula = 102;
        func.nome = "Jose Augusto ";
        func.sobrenome = "Silva";
        func.salario = 2234.54f;
        
        System.out.println(" Dados do Empregado ");
        System.out.println("Matricula: "  +  func.matricula);
        System.out.println("Nome Completo: "+ func.nome + func.sobrenome);
        System.out.println("Salario: R$ " + func.salario);
    }
    
}
