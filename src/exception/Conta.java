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
public class Conta {

    private int numero;  // atributos ou variáveis de instância
    private double saldo;
    private double limite;
    private static int totalDeContas;
   
    private int identificador;

    Conta() {
        Conta.totalDeContas = Conta.totalDeContas + 1;
        identificador = Conta.totalDeContas;
        System.out.println("Construindo uma conta!");
    }

    Conta(double saldo) {
        this(); // chama o contrutor padrão
        this.saldo = saldo;
    }

    Conta(double saldo, double limite, int numero) {
        this(saldo); // executa o construtor acima
        this.limite = limite;
        this.numero = numero;
    }

    public int getIdentificador() {
        return identificador;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

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

    public void saca(double quantidade) throws Exception { //método
        if (this.getSaldo() >= quantidade) {
            this.saldo = this.saldo - quantidade;
            System.out.println("Transferência realizada");
        } else {
            throw new Exception();
        }
    }

    public void deposita(double quantidade) { //método
        this.saldo = this.saldo + quantidade;
    }

    public void transfere(Conta destino, double quantidade) {
        try {
            this.saca(quantidade);
            destino.deposita(quantidade);
        } catch (Exception ex) {
            System.out.println("Transferência não realizada");
        }
       
        
    }

}
