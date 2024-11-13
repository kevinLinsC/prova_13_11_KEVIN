/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_07_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_07_KEVIN {

    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        dado = new DataInputStream(System.in);
        
        // Primeiro jogador.
        String nome_jogador_um;
        String pistas[] = new String[5];
        String filme_jogador_um;
        
        // Segundo jogador.
        String nome_jogador_dois;
      
        // Nome do jogador um.
        System.out.print("Digite seu nome jogador um: ");
        nome_jogador_um = dado.readLine();
        Linha();
        
        // Filme a ser adivinhado.
        System.out.print("Digite o nome do filme a ser adivinhado: ");
        filme_jogador_um = dado.readLine();
        filme_jogador_um = filme_jogador_um.toLowerCase();
        
        Linha();
        System.out.println("DIGITE AS PISTAS SOBRE O SEU FILME, " + nome_jogador_um.toUpperCase() + "!");
        Linha();
        
        // Pistas do jogador um.
        for (int i = 0; i <= 4; i++) {
            System.out.print("Digite a " + (i + 1) + " pista: ");
            pistas[i] = dado.readLine();
        }
        
        // Nome jogador dois.
        Linha();
        System.out.print("Digite seu nome jogador dois: ");
        nome_jogador_dois = dado.readLine();
        
        // Tentativas jogador dois.
        Linha();
        System.out.println("VAMOS AS TENTATIVAS, " + nome_jogador_dois.toUpperCase() + "!");
        Linha();
        
        String tentativa_jogador_dois;
        int tentativas = 1;
        
        // Pega as tentativas do jogador dois.
        for (int i = 0; i <= 4; i++) {
            System.out.println("Dica: " + pistas[i]);
            Linha();
            
            System.out.print("Sua tentativa: ");
            tentativa_jogador_dois = dado.readLine();
            tentativa_jogador_dois = tentativa_jogador_dois.toLowerCase();
            
            if (filme_jogador_um.equals(tentativa_jogador_dois)) {
                Linha();
                System.out.println("PARABENS! Voce conseguiu acertar o filme com " + tentativas + " tentativas.");
                break;
            }
            else {
                tentativas++;
            }
            Linha();
        }
    }
    
    public static void Linha() {
        System.out.println("----------------------------------------");
    }
}
