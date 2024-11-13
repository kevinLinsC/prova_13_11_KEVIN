/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_09_kevin;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_09_KEVIN {

    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        String nome_lutador;
        float peso_lutador;
        String categoria;
        
        dado = new DataInputStream(System.in);
        
        // Nome lutador.
        System.out.print("Digite o nome do lutador: ");
        nome_lutador = dado.readLine();
        
        // Peso lutador
        peso_lutador = PegaPeso("Digite o peso do lutador: ");
        
        categoria = Categoria(peso_lutador);
        
        System.out.println("Nome fornecido: " + nome_lutador);
        System.out.println("Peso fornecido: " + peso_lutador);

        FileWriter arquivo = new FileWriter("C:\\Users\\k.andrade\\Desktop\\Lutador " + nome_lutador + ".txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        gravar.println("O lutador " + nome_lutador + " pesa " + peso_lutador + " e se enquadra na categoria " + categoria + ".");
        
        arquivo.close();
    }
    
    public static float PegaPeso(String texto) throws IOException {
        DataInputStream dado;
        String s;
        float peso;
        
        while (true) {
            System.out.print(texto);
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            
            try {
                peso = Float.parseFloat(s);
                if (peso <= 0) {
                    System.out.println("Peso nao pode ser zero ou negativo.");
                }
                else {
                    break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Digite somente numeros.");
                Linha();
            }
        }
        
        return peso;
    }
    
    public static String Categoria(float peso) {
        String categoria;
        
        if (peso < 65) {
            categoria = "Pena";
        }
        else if (peso >= 65 && peso < 72) {
            categoria = "Leve";
        }
        else if (peso >= 72 && peso < 79) {
            categoria = "Ligeiro";
        }
        else if (peso >= 79 && peso < 86) {
            categoria = "Meio medio";
        }
        else if (peso >= 86 && peso < 93) {
            categoria = "Medio";
        }
        else if (peso >= 93 && peso < 100) {
            categoria = "Meio pesado";
        }
        else {
            categoria = "Pesado";
        }
        
        return categoria;
    }
    
    public static void Linha() {
        System.out.println("----------------------------------------");
    }
}
