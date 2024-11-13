/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_05_kevin;

import java.io.DataInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_05_KEVIN {

    public static void main(String[] args) throws IOException {
        int codigo_usuario_correto = 1234;
        int senha_usuario_correto = 9999;  
        int codigo;
        int senha;
        
        // Codigo usuário
        do {
            codigo = PegaNum("Digite o codigo do usuario para entrar: ");
            if (codigo != codigo_usuario_correto) {
                System.out.println("Usuario invalido!");
                Linha();
            }
        } while (codigo != codigo_usuario_correto);
        
        // Senha usuário
        do {
            senha = PegaNum("Digite a senha do usuario para entrar: ");
            if (senha != senha_usuario_correto) {
                System.out.println("senha incorreta");
                Linha();
            }
        } while (senha != senha_usuario_correto);
        
        Linha();
        
        System.out.println("Acesso permitido");
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
