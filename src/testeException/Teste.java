/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tulio
 */
public class Teste {

    public static void main(String[] args) {
        try {
            abrirArquivo("teste.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Erro de abertura do arquivo"+ex);
        }
    }

    static void abrirArquivo(String nome) throws FileNotFoundException{
        Scanner entrada = null;
       // try {
            entrada = new Scanner(new File("d:\\_Tulio\\"+nome));
       // } catch (FileNotFoundException ex) {
        //    System.out.println("Erro abertura arquivo" + ex);
        //}

        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }
    }

}
