/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.example.interfaces;

import java.util.ArrayList;
import org.example.model.Pedido;

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
