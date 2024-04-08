/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author tulio
 */
public class TesteOld {

    public static void main(String[] args) {
        try {
            lerArquivo("teste.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ler arquivo"+ex);
        }
    }  

    static void lerArquivo(String nome) throws FileNotFoundException{
        Scanner entrada = null;
       // try {
            entrada = new Scanner(new File("d:\\_Tulio\\"+nome));

        //} catch (FileNotFoundException ex) {
        //    System.out.println("Não foi possivel abrir o arquivo" + ex);
        //}

        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }
    }
}

