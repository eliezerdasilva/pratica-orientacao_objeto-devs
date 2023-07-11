/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.controller;

import java.util.ArrayList;
import org.example.model.Endereco;

/**
 *
 * @author frete
 */
public class EnderecoController {

    private ArrayList<String> listErros;

    public ArrayList<String> validarDados(Endereco endereco) {
        listErros = new ArrayList<>();
        if (endereco.getBairro().isEmpty()) {
            listErros.add("Bairro");
        }
        if (endereco.getCep().toString().isEmpty()) {
            listErros.add("Cep");
        }
        if (endereco.getCidade().isEmpty()) {
            listErros.add("Cidade");
        }
        if (endereco.getEstado().isEmpty()) {
            listErros.add("Estado");
        }
        if (endereco.getRua().isEmpty()) {
            listErros.add("Rua");
        }

        return listErros;
    }

}
