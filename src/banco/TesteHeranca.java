/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author tulio
 */
public class TesteHeranca {
    
    public static void main(String[] args) {
        //Funcionario objFuncionario = new Funcionario("Pedro");
        Funcionario objGerente = new Gerente("João");
        objGerente.setSalario(10000);
        Funcionario objDiretor = new Diretor("Maria");
        objDiretor.setSalario(10000);
        objGerente.mostra();
        objDiretor.mostra();
        
        }
    
}
