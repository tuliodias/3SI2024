/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoHospitalcomLista;



/**
 *
 * @author tulio
 */
public class Paciente {
    private String nomePaciente;

    public Paciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public Paciente() {
    }
    
    

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    
    
}
