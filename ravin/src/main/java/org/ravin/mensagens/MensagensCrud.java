/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ravin.mensagens;

import java.util.ArrayList;

/**
 *
 * @author frete
 */
public class MensagensCrud {
    
    public String realizadoComSucesso(ArrayList<String> listErros){
        if (!listErros.isEmpty()) {
            String ultimoElemento = listErros.get(listErros.size() - 1);
  
        } else {
            System.out.println("O ArrayList está vazio.");
        }
    return null;
    }
    
}
