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
public class TestaConta {

    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        c.atualiza(0.10);
        cc.atualiza(0.10);
        cp.atualiza(0.10);
        System.out.printf("Conta: %.2f\n",c.getSaldo());
        System.out.printf("Corrente: %.2f\n",cc.getSaldo());
        System.out.printf("Poupança: %.2f\n",cp.getSaldo());

    }

}
