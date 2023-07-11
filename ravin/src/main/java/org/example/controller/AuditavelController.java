/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.controller;

import java.util.ArrayList;
import org.example.model.Auditavel;

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
