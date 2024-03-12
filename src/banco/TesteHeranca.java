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
        Funcionario objFuncionario = new Funcionario("Pedro", "0008", 1000);
        Gerente objGerente = new Gerente("João", "098798", 1000);
        Diretor objDiretor = new Diretor("Maria", "00987988", 30000);
    
        System.out.println("Nome Gerente: "+objGerente.getNome());
       
        System.out.println("Nome Funcionario: "+objFuncionario.getNome());
        System.out.println("Nome Diretor: "+objDiretor.getNome());
        
  System.out.println("Bonificação do funcionario: "+objFuncionario.getBonificacao());
  System.out.println("Bonificação do gerente: "+objGerente.getBonificacao());
    }
    
}
