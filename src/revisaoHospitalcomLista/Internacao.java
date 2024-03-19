/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoHospitalcomLista;


import java.util.List;



/**
 *
 * @author tulio
 */
public class Internacao {
    private int idInternacao;
    private double valorDiaInternacao;
    private int quantDiaInternacao;
    private String motivoInternacao;
    private double valorInternacao;
    private static int totalIdInternacao;
    
   
    
    Enfermeiro objEnfermeiro;
    Medico objMedico;
    Paciente objPaciente;

    public Internacao(Enfermeiro objEnfermeiro, Medico objMedico, Paciente objPaciente,  double valorDiaInternacao, int quantDiaInternacao, String motivoInternacao) {
         this.objEnfermeiro = objEnfermeiro;
         this.objMedico = objMedico;
         this.objPaciente = objPaciente;
        
        this.valorDiaInternacao = valorDiaInternacao;
        this.quantDiaInternacao = quantDiaInternacao;
        this.motivoInternacao = motivoInternacao;
        
        this.valorInternacao = this.valorDiaInternacao* this.quantDiaInternacao;
        
        
        Internacao.totalIdInternacao = Internacao.totalIdInternacao +1;
        this.idInternacao = Internacao.totalIdInternacao;
    }

    public int getIdInternacao() {
        return idInternacao;
    }

    public void setIdInternacao(int idInternacao) {
        this.idInternacao = idInternacao;
    }

    public double getValorDiaInternacao() {
        return valorDiaInternacao;
    }

    public void setValorDiaInternacao(double valorDiaInternacao) {
        this.valorDiaInternacao = valorDiaInternacao;
    }

    public int getQuantDiaInternacao() {
        return quantDiaInternacao;
    }

    public void setQuantDiaInternacao(int quantDiaInternacao) {
        this.quantDiaInternacao = quantDiaInternacao;
    }

    public String getMotivoInternacao() {
        return motivoInternacao;
    }

    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }

    public double getValorInternacao() {
        return valorInternacao;
    }

    public void setValorInternacao(double valorTotalInternacao) {
        this.valorInternacao = valorTotalInternacao;
    }

    public static int getTotalIdInternacao() {
        return totalIdInternacao;
    }

    public static void setTotalIdInternacao(int totalIdInternacao) {
        Internacao.totalIdInternacao = totalIdInternacao;
    }
    
     public static void relatorioInternacao(List<Internacao> listaInternacao) {
        double totalValorInternacao=0;
     
        for (Internacao internacao : listaInternacao) {
            System.out.println("Paciente: " + internacao.objPaciente.getNomePaciente());
            System.out.println("Medico: " + internacao.objMedico.getNomeMedico());
            System.out.println("Enfermeiro: " + internacao.objEnfermeiro.getNomeEnfermeiro());
            System.out.println("ID: " + internacao.getIdInternacao());
            System.out.println("Valor Dia: " + internacao.getValorDiaInternacao() + " Quantidade dia: " + internacao.getQuantDiaInternacao());
            System.out.println("Valor internação: " + internacao.getValorInternacao());
            System.out.println("----------------------------------");
            totalValorInternacao +=internacao.getValorInternacao();
        }
        System.out.println("Valor total: "+totalValorInternacao);
       System.out.println("----------------------------------");
    }
    
    
    
}
