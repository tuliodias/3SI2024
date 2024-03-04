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
public class TesteConstrutor {
    public static void main(String[] args) {
        Conta z = new Conta();
        Conta x = new Conta(7000);
        Conta y = new Conta(2000);
        Conta w = new Conta(20000, 50000, 12340);
        System.out.println("Saldo x: "+x.getSaldo());
        System.out.println("Saldo y: "+y.getSaldo());
        
        System.out.println("Total contas: "+Conta.getTotalDeContas());
    }
    
}
