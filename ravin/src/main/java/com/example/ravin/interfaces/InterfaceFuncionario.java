/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ravin.interfaces;

import com.example.ravin.model.Funcionario;

import java.util.ArrayList;

/**
 *
 * @author frete
 */
public interface InterfaceFuncionario {
    
    public boolean cadastraCFuncionario(Funcionario funcionario);
    public boolean editarFuncionario(Funcionario funcionario);
    public boolean excluirFuncionario(Funcionario funcionario);
    public ArrayList<Funcionario> consultarFuncionarios();
    public Funcionario consultarFuncionario();
    
}
