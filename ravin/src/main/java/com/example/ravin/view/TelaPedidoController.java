package com.example.ravin.view;

import java.awt.Button;
import java.awt.TextArea;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableView;

public class TelaPedidoController implements Initializable {
	
	   @FXML
	    private TableView<?> tableProdutos;

	    @FXML
	    private ComboBox<?> comboBoxBebida;

	    @FXML
	    private Button buttonExcluir;

	    @FXML
	    private TableView<?> tableProdAdicionados;

	    @FXML
	    private TextArea txtDescricao;

	    @FXML
	    private Button buttonAdicionar;

	    @FXML
	    private ComboBox<?> comboBoxCardapio;

	    @FXML
	    private MenuButton comboBoxQuantProd;

	    @FXML
	    private Button buttonFinalizar;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
