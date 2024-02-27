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
public class Conta {

    private int numero;  // atributos ou variáveis de instância
    private double saldo;
    private double limite;
    
    Cliente objCliente = new Cliente() ;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    

    public double getSaldo() {
        return saldo + limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean saca(double quantidade) { //método
        if (this.getSaldo() >= quantidade) {
            this.saldo = this.saldo - quantidade;
            System.out.println("Saque realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente: " + this.getSaldo());
            return false;
        }
    }

    public void deposita(double quantidade) { //método
        this.saldo = this.saldo + quantidade;
    }

    public void transfere(Conta destino, double quantidade) {
        if (this.saca(quantidade)) {
            destino.deposita(quantidade);
        } else {
            System.out.println("Transferência não realizada!");
        }
    }

}
