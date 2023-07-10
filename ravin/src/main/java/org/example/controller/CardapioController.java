/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.controller;

import org.example.model.Cardapio;
import java.util.ArrayList;

public class CardapioController {
    
    private ArrayList<String> listErros;

    
    public ArrayList<String> validarDados(Cardapio cardapio){
        listErros = new ArrayList<String>();
        if(cardapio.getNome().isEmpty()){
            listErros.add("Nome");
        }
        if(cardapio.getListaProdutos().isEmpty()){
            listErros.add("Produtos");
        }
        if(cardapio.getDisponibilidade()== null){
             listErros.add("Disponibilidade");
        }
        return listErros;
    }

    
}
