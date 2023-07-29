/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ravin.controller;

import com.example.ravin.model.Auditavel;

import java.util.ArrayList;


/**
 *
 * @author frete
 */
public class AuditavelController {

    private ArrayList<String> listErros;

    public ArrayList<String> validarDados(Auditavel auditavel) {
        listErros = new ArrayList<>();
        if (auditavel.getAlteradoEm().toString().isEmpty()) {
            listErros.add("Alterado em");
        }
        if (auditavel.getAlteradoPor().toString().isEmpty()) {
            listErros.add("Alterado por");
        }

        if (auditavel.getCriadoPor().toString().isEmpty()) {
            listErros.add("Criado por");
        }
        if (auditavel.getCriedoEm().toString().isEmpty()) {
            listErros.add("Criado em");
        }
        return listErros;
    }
    

}
