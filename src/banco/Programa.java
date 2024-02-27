/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;
import java.lang.System;


public class Programa {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Conta minhaConta = new Conta();
       // minhaConta.cliente = "Tulio Marcos"; // enviando valor para o atributo no objeto
	//minhaConta.setCliente("Tulio Marcos");
       //minhaConta.saldo = minhaConta.saldo - 1000.0;
        minhaConta.setLimite(20000);
        minhaConta.deposita(1000);
        minhaConta.saca(10000);

	System.out.println("Saldo minhaConta: " + minhaConta.getSaldo());
	//System.out.println("Nome Cliente: " + minhaConta.getCliente());

        
         Conta outraConta = new Conta();
        
        
    
    
    }
    
}
