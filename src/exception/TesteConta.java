/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tulio
 */
public class TesteConta {
    public static void main(String[] args)  {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c1.deposita(100);
        c2.deposita(500);
        try {
            c1.saca(1);
        } catch (Exception ex) {
            System.out.println("Saldo insuficiente");
        }
        
        c1.transfere(c2, 10);
    }
    
}
