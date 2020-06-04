/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni2code2;

/**
 *
 * @author teksa
 */
public class Uni2code2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FuncionarioComissionado f = new FuncionarioComissionado("Jose", "Maria", 1234.54, 2);
        
        f.vendeu(5);
        System.out.println("Nome: " + f.getNome());;
        System.out.println("Sobrenome: " + f.getSobrenome());
        System.out.println("Salario base: " + f.getSalario());
        System.out.println("Total (sal+com): " + f.calcPagamento() );
        
    }
    
}
