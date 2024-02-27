/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

/**
 *
 * @author tulio
 */
public class TiposPrimitivos {
  

    public static void main(String[] args) {
        // tipos inteiros
        byte idade = -127;
        short nPais = 32767;
        int nAluno = -2147483648;
        long nHabitante = 1000000000000000000L;
        //tipos decimais
        float salario = 1000.35f;
        double totalSalario = 1009000.35;

        boolean opcao = true; //false

        char sexo = 'F';

        System.out.println("Byte: " + idade);
        System.out.println("Short: " + nPais);
        System.out.println("Int: " + nAluno);
        System.out.println("Long: " + nHabitante);
        System.out.println("Float: " + salario);
        System.out.println("Double: " + totalSalario);
        System.out.println("Boolean: " + opcao);
        System.out.println("Char: " + sexo);
        
        //tipos classe
        Byte a = 40;
        Short b;
        Integer c=1000;
        Long d;
        
        Double e=0.0;
        Float f;
        
        Character g;
        String h;
        
        Boolean i;
        
        /*
        Os tipos primitivos, como o "int" em Java, armazenam valores 
        diretamente, enquanto os tipos classe, como o "Integer", 
        são objetos que contêm um valor primitivo. Os tipos primitivos 
        têm um tamanho fixo na memória, o que os torna mais eficientes 
        em termos de uso de recursos. Por outro lado, os tipos classe 
        oferecem funcionalidades adicionais, como métodos e a capacidade 
        de serem usados em estruturas de dados mais complexas.
                */
        
        // constante em java
        
        final double PI = 3.14159265358979323846;
        
         // atributo static pertence a classe e não ao objeto
         //public static int contador = 0; 
        
        
        
        
    }

}
