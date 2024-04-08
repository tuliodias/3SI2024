/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama;

/**
 *
 * @author tulio
 */
public class Teste {
    public static void main(String[] args) {
        SistemaInterno sis = new SistemaInterno();
        Engenheiro eng1 = new Engenheiro("Enrico", 10, 12, 1981, "Rua da Palmeiras", "Centro", 23);
        Gerente ger1 = new Gerente("Lucas", 11, 4, 1988, "Av. Santa Cruz", "Centro", 300, "123");
        Diretor dir1 = new Diretor("Marcela", 13, 10, 1990, "Rua dos Pintados", "Morada da Serra", 12, "321");
        Cliente cli1 = new Cliente("Pedro", "444", 22, 5, 2000, "Rua das Casas", "Centro", 1000);
        eng1.mostraDados();
        
        sis.login(ger1, "123");
        ger1.mostraDados();
        sis.login(dir1, "321");
        dir1.mostraDados();
        sis.login(cli1, "333");
        cli1.mostraDados();
        
    }
    
}
