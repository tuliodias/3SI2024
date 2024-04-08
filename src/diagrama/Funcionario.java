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
public abstract class Funcionario {
    protected String nome;
    Endereco end = new Endereco();
    Data nascimento = new Data();

    public Funcionario(String nome, int dia, int mes, int ano, String rua, String bairro,int numero) {
        this.nome = nome;
        this.nascimento.setDia(dia);
        this.nascimento.setMes(mes);
        this.nascimento.setAno(ano);
        this.end.setRua(rua);
        this.end.setBairro(bairro);
        this.end.setNumero(numero);
    }
    
    
}
