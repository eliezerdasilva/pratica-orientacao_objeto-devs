package com.example.ravin.view;

import java.awt.Button;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;

public class TelaManterFuncionarioController implements Initializable {


    @FXML
    private CheckBox comboBoxInativo;

    @FXML
    private TextField txtTelefone;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtRua;

    @FXML
    private Button buttonAlterar;

    @FXML
    private Button buttonExcluir;

    @FXML
    private Button buttonCadastrar;

    @FXML
    private TextField txtCidade;

    @FXML
    private Button buttonBuscaCliente;

    @FXML
    private ComboBox<?> comboBoxEstado;

    @FXML
    private TextField txtCep;

    @FXML
    private CheckBox comboBoxAtivo;

    @FXML
    private TextField txtBairro;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
