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
public class Diretor extends Funcionario{

    public Diretor(String nome) {
        super(nome);
    }
    
   
    
     @Override
     public double getBonificacao() { // reescrita de método
         
        return super.getSalario() * 0.10;
    }
    
   
    
    
}
