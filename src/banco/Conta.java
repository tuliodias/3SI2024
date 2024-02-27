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
    private String cliente;
    private double saldo;
    private double limite;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {

        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void saca(double quantidade) { //método
        this.saldo = this.saldo - quantidade;
    }

    public void deposita(double quantidade) { //método
        this.saldo = this.saldo + quantidade;
    }

}
