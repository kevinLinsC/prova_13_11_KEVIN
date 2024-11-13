/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_02_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_02_KEVIN {

    public static void main(String[] args) throws IOException {
        int anos;
        int meses;
        int dias;
        int tot_dias = 0;
        
        System.out.println("CALCULADORA DE TOTAL DE DIAS");
        Linha();
        
        anos = PegaNum("Digite quantos anos: "); // Anos.
        Linha();
        meses = PegaNum("Digite quantos meses: "); // Meses.
        Linha();
        dias = PegaNum("Digite quantos dias: "); // Dias.
        
        tot_dias = (anos * 365) + (meses * 30) + dias; // Soma da quantidade de dias contidas em anos, meses e dias.
        
        System.out.println("A quantidade de total de dias e: " + tot_dias);
        System.out.println(String.format("%d anos, %d meses e %d dias = %d dias.", anos, meses, dias, tot_dias));
        
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
