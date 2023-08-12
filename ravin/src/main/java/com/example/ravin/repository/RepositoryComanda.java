/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ravin.repository;

import com.example.ravin.controller.ComandaController;
import com.example.ravin.interfaces.InterfaceComanda;
import com.example.ravin.model.Comanda;

import java.util.ArrayList;


/**
 *
 * @author frete
 */
public class RepositoryComanda implements InterfaceComanda {
    
    private static ComandaController instancia;
    
    public ComandaController getInstacia(){
         if (instancia == null) {
            instancia = new ComandaController();
        }
        return instancia;
    }

    @Override
    public boolean cadastrarComanda(Comanda comanda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean alterarComanda(Comanda comanda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean excluiComanda(Comanda comanda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Comanda> listarComadas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Comanda consultarComada(Integer comanda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
