package com.example.ravin.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

public class TelaMenuController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}




    @FXML
    private Menu MenuCardapio;

    @FXML
    private ButtonBar MenuCliente;

    @FXML
    private Menu MenuComanda;

    @FXML
    private Menu MenuFuncionario;

    @FXML
    private Menu MenuPedido;

    @FXML
    private Menu MenuProduto;

    @FXML
    private Menu MenuSair;

    @FXML
    private Button buttonIniciarExpediente;

    @FXML
    private Pane painelDados;

    @FXML
    private RadioButton radiuButtonAtivo;

    @FXML
    private RadioButton radiunButtonInativo;

    @FXML
    private TextField txtCarrgoFuncionario;

    @FXML
    private TextField txtNomeFuncionario;

    @FXML
    private Label txtSetarNome;

    @FXML
    private TextField txtTelefone;

    @FXML
    public void telaFuncionario(){}

}