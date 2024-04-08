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
public class Engenheiro extends Funcionario implements Utilitario{

    public Engenheiro(String nome, int dia, int mes, int ano, String rua, String bairro, int numero) {
        super(nome, dia, mes, ano, rua, bairro, numero);
    }

    @Override
    public void mostraDados() {
        System.out.println("Engenheiro");
        System.out.println("Nome: "+this.nome);
        System.out.println("Nascimento: "+this.nascimento.getDia()+"/"+this.nascimento.getMes()+"/"+this.nascimento.getAno());
        System.out.println("Endereço: "+this.end.getRua()+"-"+this.end.getNumero()+". "+this.end.getBairro());
        System.out.println("-------------------------------------------");
    }
    
}
