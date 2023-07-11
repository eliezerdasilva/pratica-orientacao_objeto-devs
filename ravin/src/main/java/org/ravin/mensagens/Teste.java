/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ravin.mensagens;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDate;

/**
 *
 * @author frete
 */
public class Teste {
    
   public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(2021, 7, 10);
        LocalDate data2 = LocalDate.of(2021, 7, 11);

        if (data1.isAfter(data2)) {
            System.out.println("A data1 é posterior à data2");
        } else {
            System.out.println("A data1 não é posterior à data2");
        }
    }
    
}

