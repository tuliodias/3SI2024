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
public class Cliente implements Utilitario, Autenticavel{
    
    private String nome, senha;
    Data nascimento = new Data();
    Endereco end = new Endereco();

    public Cliente(String nome, String senha, int dia, int mes, int ano, String rua, String bairro, int numero) {
        this.nome = nome;
        this.senha = senha;
        this.nascimento.setDia(dia);
        this.nascimento.setMes(mes);
        this.nascimento.setAno(ano);
        this.end.setBairro(bairro);
        this.end.setRua(rua);
        this.end.setNumero(numero);
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
  @Override
    public void mostraDados() {
        System.out.println("Cliente");
        System.out.println("Nome: "+this.nome);
        System.out.println("Nascimento: "+this.nascimento.getDia()+"/"+this.nascimento.getMes()+"/"+this.nascimento.getAno());
        System.out.println("Endereço: "+this.end.getRua()+"-"+this.end.getNumero()+". "+this.end.getBairro());
        System.out.println("-------------------------------------------");
    }

    @Override
    public void autentica(String senha) {
        if(this.getSenha().equals(senha)){
            System.out.println("Sr. Cliente "+this.nome+". Login realizado com sucesso!");
        }else{
           System.out.println("Sr. Cliente "+this.nome+". Login inválido!");  
        }
    }
    
}
