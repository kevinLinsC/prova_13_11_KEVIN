/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_03_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_03_KEVIN {

    public static void main(String[] args) throws IOException {
        int opcao;
        String[] opcoes_cafe = {"Cafe expresso", "Cafe capuccino", "Leite com cafe"};
        float[] cafe_preco = {0.75f, 1.00f, 1,25f};
        int[] qtd_cafe = {0, 0, 0, 0};
        float[] total_cafe = new float[4];
        
        // Mostra as opções para o usuário.
        for (int i = 0; i < opcoes_cafe.length; i++) {
                System.out.println((i + 1) + " - " + opcoes_cafe[i] + " - R$" + cafe_preco[i]);
                
            }
            System.out.println((opcoes_cafe.length + 1) + " - Totalizar vendas");
        
        // Pergunta até o usuário digitar 4 e finaliza o pedido.
        do {
            
            Linha();
            
            opcao = PegaNum("Escolha: ");
            opcao--;
            
            // Soma preço e quantidade.
            switch (opcao) {
                case 0:
                    qtd_cafe[opcao]++;
                    total_cafe[opcao] += cafe_preco[opcao];
                    break;
                case 1:
                    qtd_cafe[opcao]++;
                    total_cafe[opcao] += cafe_preco[opcao];
                    break;
                case 2:
                    qtd_cafe[opcao]++;
                    total_cafe[opcao] += cafe_preco[opcao];
                    break;
            }
            
        } while (opcao != 3);
        
        // Total de todas as vendas.
        qtd_cafe[3] = qtd_cafe[0] + qtd_cafe[1] + qtd_cafe[2];
        total_cafe[3] = total_cafe[0] + total_cafe[1] + total_cafe[2];
        
        // Mostra o resultado.
        for (int i = 0; i < opcoes_cafe.length; i++) {
            System.out.println(qtd_cafe[i] + " e R$" + total_cafe[i] + " de " + opcoes_cafe[i] + " vendido;");
        }
        System.out.println(qtd_cafe[3] + " e R$" + total_cafe[3] + " de todos cafes vendidos.");
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
