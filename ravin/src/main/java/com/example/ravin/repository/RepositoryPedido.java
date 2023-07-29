/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ravin.repository;

import com.example.ravin.controller.PedidoController;
import com.example.ravin.interfaces.InterfacePedido;
import com.example.ravin.model.Pedido;

import java.util.ArrayList;


/**
 *
 * @author frete
 */
public class RepositoryPedido implements InterfacePedido {
    
    private static PedidoController instancia;
    
    public PedidoController getInstacia(){
         if (instancia == null) {
            instancia = new PedidoController();
        }
        return instancia;
    }
    @Override
    public boolean cadastrarPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean alterarPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean excluirPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Pedido> listarPedidos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pedido consultarPedido(Integer Pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
