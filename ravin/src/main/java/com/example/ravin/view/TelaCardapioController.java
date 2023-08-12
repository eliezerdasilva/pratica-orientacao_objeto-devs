package com.example.ravin.view;

import java.awt.Button;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class TelaCardapioController implements Initializable {
	
	@FXML
    private Button buttonAdicionar;

    @FXML
    private Button buttonCadastrarCardapio;

    @FXML
    private Button buttonExcluirCardapio;

    @FXML
    private Button buttonTirarProduto;

    @FXML
    private Button buttonVoltarMenu;

    @FXML
    private ComboBox<?> comboBoxFiltro;

    @FXML
    private ComboBox<?> comboBoxQuatProduto;

    @FXML
    private TableView<?> tableProdContidos;

    @FXML
    private TableView<?> tableProdutos;

    @FXML
    private TextArea txtDescricao;

    @FXML
    private TextField txtNomeCadapio;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
