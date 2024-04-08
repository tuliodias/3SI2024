/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama;

/**
 *
 * @author tulio
 */
public class Diretor extends Funcionario implements Utilitario, Autenticavel{
private String senha;

    public Diretor(String nome, int dia, int mes, int ano, String rua, String bairro, int numero, String senha) {
        super(nome, dia, mes, ano, rua, bairro, numero);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public void mostraDados() {
        System.out.println("Diretor");
        System.out.println("Nome: "+this.nome);
        System.out.println("Nascimento: "+this.nascimento.getDia()+"/"+this.nascimento.getMes()+"/"+this.nascimento.getAno());
        System.out.println("Endereço: "+this.end.getRua()+"-"+this.end.getNumero()+". "+this.end.getBairro());
        System.out.println("-------------------------------------------");
    }

    @Override
    public void autentica(String senha) {
        if(this.getSenha().equals(senha)){
            System.out.println("Sr. Diretor "+this.nome+". Login realizado com sucesso!");
        }else{
           System.out.println("Sr. Diretor "+this.nome+". Login inválido!");  
        }
    }
    
}
