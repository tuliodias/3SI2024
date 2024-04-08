/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author tulio
 */
public class ExemploInterface {
    public static void main(String[] args) {
        List<String> listaNome = new ArrayList<>();
        List<String> listaNome2 = new LinkedList<>();
    }
    
    private static void metodo(List lista){
        String nome="Maria";
        lista.add(nome);
    }
    
}
