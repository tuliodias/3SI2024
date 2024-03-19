/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoHospitalcomLista;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author tulio
 */
public class Teste {
    public static void main(String[] args) {
        List<Internacao> listaInternacao = new ArrayList<>();
        Paciente cli1  = new Paciente("João Alves");
        Enfermeiro enf1 = new Enfermeiro();
        enf1.setNomeEnfermeiro("Nivaldo");
        Medico med1 = new Medico("Thadeu");
        Medico med2 = new Medico("Maria");
        Internacao inter1 = new Internacao(enf1, med1, cli1, 500.50, 10, "Covid");
        Internacao inter2 = new Internacao(enf1, med2, cli1, 500.50, 5, "Pneumonia");
        listaInternacao.add(inter1);
        listaInternacao.add(inter2);
        Internacao.relatorioInternacao(listaInternacao);
        
        
      
        
    }
    
}
