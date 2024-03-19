/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade6;

/**
 *
 * @author tulio
 */
public class ContaCorrente extends Conta {

    @Override
    void atualiza(double taxa) {
        super.deposita(this.getSaldo() * (taxa * 2));
    }
    
    @Override
     void deposita(double valor) {
         super.deposita(valor-1);
    }

}
