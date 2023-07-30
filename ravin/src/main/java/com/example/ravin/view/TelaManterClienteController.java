package com.example.ravin.view;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;

public class TelaManterClienteController implements Initializable {


    @FXML
    private Checkbox comboBoxInativo;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtTelefone;

    @FXML
    private CheckBox CheckBoxVip;

    @FXML
    private TextField txtCpf;

    @FXML
    private AnchorPane datePickerNascimento;

    @FXML
    private ComboBox<?> comboBoxAlergia;

    @FXML
    private TextField txtRua;

    @FXML
    private Button buttonAlterar;

    @FXML
    private Button buttonCadastrar;

    @FXML
    private Button buttonExcluir;

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
