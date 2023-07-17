/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ravin.repository;

import java.util.ArrayList;
import org.example.controller.MesaController;
import org.example.interfaces.InterfaceMesa;
import org.example.model.Mesa;

/**
 *
 * @author frete
 */
public class RepositoryMesa implements InterfaceMesa {

    private static MesaController instancia;
    
    public MesaController getInstacia(){
         if (instancia == null) {
            instancia = new MesaController();
        }
        return instancia;
    }
    
    @Override
    public boolean cadastrarMesa(Mesa mesa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean alterarMesa(Mesa mesa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean excluirMesa(Mesa mesa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Mesa> consutarMesas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Mesa consultaMesa(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
