/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ravin.interfaces;

import com.example.ravin.model.Cliente;

import java.util.ArrayList;


/**
 *
 * @author frete
 */
public interface InterfaceCliente {
    
    
    public boolean cadastraCliente(Cliente cliente);
    public boolean editarCliente(Cliente cliente);
    public boolean excluirCliente(Cliente cliente);
    public ArrayList<Cliente> consultarClientes();
    public Cliente consultarCliente();
    
}
