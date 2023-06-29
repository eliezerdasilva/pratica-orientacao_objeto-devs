/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.example.interfaces;

import java.util.ArrayList;
import org.example.model.Cliente;

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
