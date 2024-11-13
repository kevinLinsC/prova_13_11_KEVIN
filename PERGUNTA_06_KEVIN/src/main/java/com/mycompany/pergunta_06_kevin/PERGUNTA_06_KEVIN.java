/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_06_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_06_KEVIN {

    public static void main(String[] args) throws IOException {
        int qtd_num;
        int num;
        float soma_num = 0;
        float media_num;
        
        qtd_num = PegaNum("Digite o numero para tamanho do vetor: ");
        
        // Pega os números do usuário.
        for (int i = 0; i < qtd_num; i++) {
            num = PegaNum("Digite o " + (i + 1) + " numero: ");
            soma_num += num; // Soma dos números.
        }
        
        media_num = soma_num / qtd_num; // Média dos números.
        Linha();
        
        System.out.println("A media dos numeros e: " + media_num);
        System.out.println("A soma dos numeros e: " + soma_num);
        System.out.println("A quantidade de valores digitados e: " + qtd_num);
    }
    
    public static int PegaNum(String texto) throws IOException {
        DataInputStream dado;
        String s;
        int num;
        
        while (true) {
            System.out.print(texto);
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            
            try {
                num = Integer.parseInt(s);
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Digite somente numeros.");
                Linha();
            }
        }
        
        return num;
    }
    
    public static void Linha() {
        System.out.println("----------------------------------------");
    }
}
