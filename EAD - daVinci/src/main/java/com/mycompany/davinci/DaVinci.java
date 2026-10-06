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
       
        String frase1 = "UM CIENTISTA DA COMPUTAÇAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";

        String frase2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";

        System.out.println(pilha.inverterFrase(frase1));
        System.out.println(pilha.inverterFrase(frase2));
        
    }
}
