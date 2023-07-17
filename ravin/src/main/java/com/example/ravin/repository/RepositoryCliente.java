/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ravin.repository;

import java.util.ArrayList;
import org.example.controller.ComandaController;
import org.example.interfaces.InterfaceCliente;
import org.example.interfaces.InterfaceComanda;
import org.example.model.Cliente;

/**
 *
 * @author frete
 */
public class RepositoryCliente implements InterfaceCliente {
    
    private static RepositoryCliente instancia;
    
    public RepositoryCliente getInstacia(){
         if (instancia == null) {
            instancia = new RepositoryCliente();
        }
        return instancia;
    }

    @Override
    public boolean cadastraCliente(Cliente cliente) {
        return false;
    }

    @Override
    public boolean editarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean excluirCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Cliente> consultarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente consultarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
