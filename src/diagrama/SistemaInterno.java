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
public class SistemaInterno {
    
    public void login (Autenticavel a, String senha){
        //faz uma série de verificações
        a.autentica(senha);  // autentica a senha
    }
    
}
