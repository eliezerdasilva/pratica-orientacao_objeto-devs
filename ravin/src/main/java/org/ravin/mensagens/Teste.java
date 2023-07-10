/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ravin.mensagens;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 *
 * @author frete
 */
public class Teste {
    
    public static void main(String[] args) {
        System.out.println("Eee");
        try {
            // Código que pode lançar uma exceção
            int resultado = 10 / 0;
        } catch (Exception ex) {
            // Capturando a exceção e convertendo em uma string
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            ex.printStackTrace(pw);
            String excecaoString = sw.toString();

            // Imprimindo a string da exceção
            System.out.println(excecaoString);
        }
    
}
}
