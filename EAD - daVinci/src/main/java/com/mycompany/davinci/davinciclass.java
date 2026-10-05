/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.davinci;

import java.util.Stack;

/**
 *
 * @author gabri
 */
public class davinciclass {

    public String inverterFrase(String frase) {

        String[] palavras = frase.split(" ");

        String resultado = "";

        for (String palavra : palavras) {

            Stack<Character> pilha = new Stack<>();

            for (int i = 0; i < palavra.length(); i++) {
                pilha.push(palavra.charAt(i));
            }

            while (!pilha.empty()) {
                resultado += pilha.pop();
            }

            resultado += " ";
        }

        return resultado.trim();
    }
}