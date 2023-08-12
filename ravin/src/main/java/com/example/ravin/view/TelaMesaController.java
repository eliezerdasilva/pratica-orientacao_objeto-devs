package com.example.ravin.view;

import java.awt.Button;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;

public class TelaMesaController implements Initializable {


    @FXML
    private Spinner<?> SpinerCodigoMesa;

    @FXML
    private Button buttonAlterar;

    @FXML
    private Button buttonCadastrar;

    @FXML
    private Button buttonExcluir;

    @FXML
    private Button buttonVoltar;

    @FXML
    private Spinner<?> spinnerQuantidadePessoas;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
