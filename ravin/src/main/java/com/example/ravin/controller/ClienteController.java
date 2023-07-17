/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ravin.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import org.example.model.Auditavel;
import org.example.model.Cliente;

/**
 *
 * @author frete
 */
public class ClienteController {

    private ArrayList<String> listErros;
    private EnderecoController enderecoController;
    private AuditavelController auditavelController;
    private Auditavel auditavel;

    public ArrayList<String> validarDados(Cliente cliente) {
        listErros = new ArrayList<>();
        /*Endereço*/
        enderecoController = new EnderecoController();
        ArrayList<String> listErrosEndereco = enderecoController.validarDados(cliente.getEndereco());
        
        /*Auditavel*/
        auditavel = new Auditavel();
        auditavel.setAlteradoEm(cliente.getAlteradoEm());
        auditavel.setAlteradoPor(cliente.getAlteradoPor());
        auditavel.setCriadoPor(cliente.getCriadoPor());
        auditavel.setCriedoEm(cliente.getCriedoEm());
        
        ArrayList<String> listErrosAuditavel = auditavelController.validarDados(auditavel);
        
        LocalDate dataAtual = LocalDate.now();
        //Validações
        if (cliente.getNome().isEmpty()) {
            listErros.add("Nome");
        }
        if (cliente.getCpf().toString().isEmpty()) {
            listErros.add("Cpf");
        }
        if (listErrosEndereco != null) {
            for (String erros : listErrosEndereco) {
                listErros.add(erros);
            }

        }
        if(listErrosAuditavel != null){
            for (String auditavelErros : listErrosAuditavel) {
                listErros.add(auditavelErros);
            }
        }
        if(cliente.getDataNascimento().toString().isEmpty()){
            listErros.add("Data-Nascimento");
        }
        if(dataAtual.isBefore(cliente.getDataNascimento())){
            listErros.add("Data Posterior");          
        }
        return listErros;
    }

}
