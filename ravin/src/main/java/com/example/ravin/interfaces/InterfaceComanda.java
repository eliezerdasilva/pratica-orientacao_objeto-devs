/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ravin.interfaces;


import com.example.ravin.model.Comanda;

import java.util.ArrayList;


/**
 *
 * @author frete
 */
public interface InterfaceComanda {
    
    public boolean cadastrarComanda(Comanda comanda);
    public boolean alterarComanda(Comanda comanda);
    public boolean excluiComanda(Comanda comanda);
    public ArrayList<Comanda> listarComadas();
    public Comanda consultarComada(Integer comanda);
    
}
