/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ravin.interfaces;

import com.example.ravin.model.Mesa;

import java.util.ArrayList;


/**
 *
 * @author frete
 */
public interface InterfaceMesa {
    
    public boolean cadastrarMesa(Mesa mesa);
    public boolean alterarMesa(Mesa mesa);
    public boolean excluirMesa(Mesa mesa);
    public ArrayList<Mesa> consutarMesas();
    public Mesa consultaMesa(Integer id);
    
    
}
