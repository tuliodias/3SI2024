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
public class TesteReferencia {
    public static void main(String[] args) {
        Conta c1 = new Conta();
       // Cliente cli1 = new Cliente();
        //c1.objCliente = cli1;
        c1.objCliente.setNome("Paola");
       // cli1.setNome("Paola");
        c1.deposita(1000);
        
       // System.out.println("Cliente: "+cli1.getNome());
        System.out.println("Saldo conta: "+c1.getSaldo());
        
        System.out.println("Cliente: "+c1.objCliente.getNome());
        
    }
    
}
