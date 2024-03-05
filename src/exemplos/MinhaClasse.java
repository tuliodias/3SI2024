/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos;

/**
 *
 * @author tulio
 */
public class MinhaClasse {
     private static class ClassePrivada {
        public void metodoDaClassePrivada() {
            System.out.println("Este é um método da classe privada");
        }
    }

    public static void main(String[] args) {
        ClassePrivada instancia = new ClassePrivada();
        instancia.metodoDaClassePrivada();
    }
    
    /*
    Neste exemplo, a classe "ClassePrivada" é declarada como 
    privada dentro da classe "MinhaClasse". Isso significa que 
    ela só pode ser acessada dentro da classe "MinhaClasse" e 
    não estará disponível para uso em outras partes do código.
    */
    
}
