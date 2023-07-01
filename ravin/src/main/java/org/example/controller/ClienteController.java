/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.controller;

import java.util.ArrayList;
import org.example.interfaces.InterfaceCliente;
import org.example.interfaces.InterfaceMetodosGerais;
import org.example.model.Cliente;

/**
 *
 * @author frete
 */
public class ClienteController implements InterfaceMetodosGerais, InterfaceCliente{
   
    private static ClienteController instancia;
    
    public ClienteController getInstacia(){
         if (instancia == null) {
            instancia = new ClienteController();
        }
        return instancia;
    }

    @Override
    public Object buscarPorId(Integer id) {
       return  null;
    }

    @Override
    public Object buscarPorNome(String nome) {
           return  null;
    }

    @Override
    public boolean cadastraCliente(Cliente cliente) {
          return  false;
    }

    @Override
    public boolean editarCliente(Cliente cliente) {
         return  false;
    }

    @Override
    public boolean excluirCliente(Cliente cliente) {
          return  false;
    }

    @Override
    public ArrayList<Cliente> consultarClientes() {
           return  null;
    }

    @Override
    public Cliente consultarCliente() {
        return  null;
    }
    
}
