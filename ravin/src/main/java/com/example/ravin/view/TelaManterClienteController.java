package com.example.ravin.view;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;



import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class TelaManterClienteController implements Initializable {

    @FXML
    private CheckBox CheckBoxVip;

    @FXML
    private Button buttonAlterar;

    @FXML
    private Button buttonBuscaCliente;

    @FXML
    private Button buttonCadastrar;

    @FXML
    private Button buttonExcluir;

    @FXML
    private ComboBox<?> comboBoxAlergia;

    @FXML
    private CheckBox comboBoxAtivo;

    @FXML
    private ComboBox<?> comboBoxEstado;

    @FXML
    private CheckBox comboBoxInativo;

    @FXML
    private DatePicker dataPickerNascimento;

    @FXML
    private AnchorPane datePickerNascimento;

    @FXML
    private TextField txtBairro;

    @FXML
    private TextField txtCep;

    @FXML
    private TextField txtCidade;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNome;

    @FXML
    private TextArea txtObservacao;

    @FXML
    private TextField txtRua;

    @FXML
    private TextField txtTelefone;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	  @FXML
	    private void onSaveButtonClicked() {
	    	
	        String nome = txtNome.getText();
	        String cpf = txtCpf.getText();
	        String telefone = txtTelefone.getText();
	        String email = txtEmail.getText();
	        LocalDate dataNascimento = dataPickerNascimento.getValue();
	        String observacao = txtObservacao.getText();
	        
	        String cep = txtCep.getText();
	        String bairro = txtCep.getText();
	        String rua = txtCep.getText();
	       
	        boolean vip = CheckBoxVip.isSelected();
	        
	        
	        /*
	        
	        
	        // Verifica se os campos obrigatórios estão vazios
	        if (nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty() || endereco.isEmpty() || dataNascimento.isEmpty()) {
	            showAlert("Por favor, preencha todos os campos obrigatórios!");
	        } else {
	            // Realize as operações de adicionar/editar o cliente aqui
	            Client newClient = new Client(nome, cpf, telefone, endereco, dataNascimento, observacao, status);
	            showAlert("Cliente salvo com sucesso!");
	        }*/
	    }
	    
	

}
