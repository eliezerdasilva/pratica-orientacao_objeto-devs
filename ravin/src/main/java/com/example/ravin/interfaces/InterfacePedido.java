/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ravin.interfaces;

import com.example.ravin.model.Pedido;

import java.util.ArrayList;


/**
 *
 * @author frete
 */
public interface InterfacePedido {
    
    public boolean cadastrarPedido(Pedido pedido);
    public boolean alterarPedido(Pedido pedido);
    public boolean excluirPedido(Pedido pedido);
    public ArrayList<Pedido> listarPedidos();
    public Pedido consultarPedido(Integer Pedido);
    
    
}
