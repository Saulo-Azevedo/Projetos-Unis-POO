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
public class FuncionarioComissionado extends Funcionario {
    private double comissao;
    private int quantidadeVendida;
    
public FuncionarioComissionado(String nome, String sobrenome, double salario, double comissao){
    super.funcionario(nome, sobrenome, salario);
    this.comissao = comissao;
    }
public double calcPagamento(){
    return (getSalario() + (comissao * this.quantidadeVendida));
}
public void vendeu(int qtdVendida){
    this.quantidadeVendida = this.quantidadeVendida+qtdVendida;
}
public void zeraVendas(){
    this.quantidadeVendida = 0;
}
    
}
