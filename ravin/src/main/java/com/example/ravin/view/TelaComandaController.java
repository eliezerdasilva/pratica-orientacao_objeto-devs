package com.example.ravin.view;

import java.awt.Button;
import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class TelaComandaController implements Initializable {
	

    @FXML
    private Button buttonExcluirPedido;

    @FXML
    private Button buttonFinalizarComanda;

    @FXML
    private Button buttonFazerPedido;

    @FXML
    private ComboBox<?> comboBoxFormaPagamento;

    @FXML
    private Label labelValor;

    @FXML
    private ComboBox<?> comboBoxMesa;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
