/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_04_kevin;

import java.io.DataInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_04_KEVIN {

    public static void main(String[] args) throws IOException {
        int num;
        
        num = PegaNum("Digite um numero: ");
        
        JOptionPane.showMessageDialog(null, "O antecessor é: " + (num - 1) + "\nO sucessor é: " + (num + 1));
    }
    
    public static int PegaNum(String texto) throws IOException {
        int num;
        String s;
        
        while (true) {
            s = JOptionPane.showInputDialog(texto);
            
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
