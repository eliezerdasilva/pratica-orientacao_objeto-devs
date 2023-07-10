/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.model;

import java.util.ArrayList;
import org.example.enumerador.Disponibilidade;

/**
 *
 * @author frete
 */
public class Cardapio {
    
    private Integer id;
    private String nome; 
    private ArrayList<Produto> listaProdutos;
    private Disponibilidade disponibilidade;

    public Cardapio() {
    }

    public Cardapio(Integer id, String nome, ArrayList<Produto> listaProdutos, Disponibilidade disponibilidade) {
        this.id = id;
        this.nome = nome;
        this.listaProdutos = listaProdutos;
        this.disponibilidade = disponibilidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    
    
    
}
