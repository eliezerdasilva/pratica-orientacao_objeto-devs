/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.controller;

/**
 *
 * @author frete
 */

    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDados {
    
    private static ConexaoBancoDados instancia;
    private Connection conexao;

    private ConexaoBancoDados() {
        // Configuração da conexão com o banco de dados
        String url = "jdbc:postgresql://localhost:5432/nome_do_banco";
        String usuario = "usuario";
        String senha = "senha";

        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão estabelecida com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer conexão com o banco de dados: " + e.getMessage());
        }
    }

    public static ConexaoBancoDados getInstance() {
        if (instancia == null) {
            instancia = new ConexaoBancoDados();
        }
        return instancia;
    }

    public Connection getConexao() {
        return conexao;
    }

    public void fecharConexao() {
        try {
            conexao.close();
            System.out.println("Conexão fechada.");
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão com o banco de dados: " + e.getMessage());
        }
    }
}

    

