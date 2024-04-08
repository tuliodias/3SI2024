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
public class Gerente extends Funcionario {

    //String nome; // herda de Funcionario
    //String cpf;
    //double salario;
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public Gerente(String nome) {
        super(nome);
    }

    

    public boolean autentica(int senha) {
        
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    
    @Override
     public double getBonificacao() { // reescrita de método
         
          return super.getSalario() * 0.20;
    }

}
