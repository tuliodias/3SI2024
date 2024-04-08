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
public abstract class Funcionario {

    public Funcionario(String nome) {
        this.nome = nome;
    }

     
    private String nome, departamento, dataEntrada, RG;
    private double salario; 
    private boolean ativo=true;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public void bonifica(double aumento){
        this.salario = this.salario +aumento;
    }
    
    public void demite(){
        this.ativo = false;
    }
    
    abstract public double getBonificacao();
    
    public void mostra(){
        System.out.println("Dados do Funcionário");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Departamento: "+this.getDepartamento());
        System.out.println("Data Entrada: "+this.getDataEntrada());
        System.out.println("RG: "+this.getRG());
        System.out.println("Salário: "+this.getSalario());
        System.out.println("Ativo: "+(this.isAtivo()==true?"Sim":"Não"));
        System.out.println("Bonificação: "+this.getBonificacao());
        System.out.println("-----------------------------------");
    }
    
    
    
    
}
