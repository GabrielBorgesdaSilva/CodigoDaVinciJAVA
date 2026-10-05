/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.davinci;

/**
 *
 * @author gabri
 */
public class DaVinci {

    public static void main(String[] args) {
        
        davinciclass pilha = new davinciclass();
        
        String frase = "ESTE EXERCICIO ESTA MUITO FACIL";
        
        String resultado = pilha.inverterFrase(frase);
        
        System.out.println(resultado);
    }
}
