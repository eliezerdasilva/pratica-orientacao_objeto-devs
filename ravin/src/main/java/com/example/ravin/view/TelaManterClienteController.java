package com.example.ravin.view;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import org.json.JSONObject;

import com.example.ravin.model.Cliente;
import com.example.ravin.model.Endereco;
import com.example.ravin.model.Funcionario;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class TelaManterClienteController implements Initializable {

	private Funcionario funcionario;
	
	public void PaisagemCalorController(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	private int  validacao = 0 ;  

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
	private TextField txtEstado;
	
	
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
	
    @FXML
    private Label labelErro;

    @FXML
    private TableColumn<Cliente, String> colunaCpf;

    @FXML
    private TableColumn<Cliente, String> colunaEmail;
    @FXML
    private TableColumn<Cliente, String> colunaNome;
    

    @FXML
    private TableView<Cliente> tableCliente;
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// listar as alergias

		ObservableList<String> items = FXCollections.observableArrayList(new String("Item 1"), new String("Item 2"),
				new String("Item 3"));

		// Check para ativo e inativo
		configureCheckBoxes();
		
		//preencher tabela
		listarClientes();

	}

	private void configureCheckBoxes() {
		// Adicione um ChangeListener para os CheckBoxes
		comboBoxAtivo.selectedProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue) {
				// checkBoxOpcao1 foi selecionado, desmarque checkBoxOpcao2
				comboBoxInativo.setSelected(false);
			}
		});

		comboBoxInativo.selectedProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue) {
				// checkBoxOpcao2 foi selecionado, desmarque checkBoxOpcao1
				comboBoxAtivo.setSelected(false);
			}
		});
	}

	@FXML
	private void cadastrarCliente() {
		// Limpar tela
		labelErro.setVisible(false);
		limparBorda();
		// setar dados
		Cliente cliente = setarObjetoCliente();
		Endereco endereco = setarObjetoEndereco();
		// Verificar se nao estao fazios
		if (cliente == null || endereco == null) {
			labelErro.setVisible(true);
			
		} else {
			cliente.setEndereco(endereco);
			
		}

	}

	public Cliente setarObjetoCliente() {
		
		validacao = 0 ; 
		
		Cliente cliente = new Cliente();

		// Atributos nao necessario
		boolean vip = false;
		vip = CheckBoxVip.isSelected();
		String observacao = txtObservacao.getText();
		boolean situacao = false;
		if (comboBoxInativo.isSelected()) {
			situacao = false;
		} else {
			situacao = true;
		}

		String nome = txtNome.getText();
		String cpf = txtCpf.getText();
		String telefone = txtTelefone.getText();
		String email = txtEmail.getText();
		LocalDate dataNascimento = dataPickerNascimento.getValue();

		if (nome.isEmpty() && nome.isBlank()) {
			txtNome.setStyle("-fx-border-color: red;");
			validacao++;
		} else {
			cliente.setNome(nome);
		}
		if (cpf.isEmpty() && cpf.isBlank()) {
			txtCpf.setStyle("-fx-border-color: red;");
			validacao++;
		} else {
			cliente.setCpf(Long.parseLong(cpf));
		}
		if (telefone.isEmpty() && telefone.isBlank()) {
			txtTelefone.setStyle("-fx-border-color: red;");
			validacao++;
		} else {
			cliente.setTelefone(telefone);
		}
		if (email.isEmpty() && email.isBlank()) {
			txtEmail.setStyle("-fx-border-color: red;");
			validacao++;
		} else {
			cliente.setNome(email);
		}
		if (dataNascimento == null) {
			dataPickerNascimento.setStyle("-fx-border-color: red;");
			if(validacao!=0) {
				return null;
			}
		} else {
			System.out.println(dataNascimento);
			cliente.setDataNascimento(dataNascimento);
		}

		cliente.setVip(vip);
		cliente.setObservacao(observacao);
		cliente.setStatus(situacao);
		return cliente;

	}

	public Endereco setarObjetoEndereco() {
		
		Endereco endereco = new Endereco();
		String cep = txtCep.getText();
		String bairro = txtBairro.getText();
		String rua = txtRua.getText();
		String estado = txtEstado.getText();
		String cidade = txtCidade.getText();
		validacao = 0 ; 
		

		if (cep.isEmpty() && cep.isBlank()) {
			txtCep.setStyle("-fx-border-color: red;");
			validacao++;
		} else {
			endereco.setCep(Long.parseLong(cep));
		}
		if (estado.isEmpty() && estado.isBlank()) {
			txtEstado.setStyle("-fx-border-color: red;");
			validacao++;
		} else {
			endereco.setEstado(estado);
		}
		if (cidade.isEmpty() && cidade.isBlank()) {
			txtCidade.setStyle("-fx-border-color: red;");
			validacao++;
		} else {
			endereco.setCidade(cidade);
		}
		if (bairro.isEmpty() && bairro.isBlank()) {
			txtBairro.setStyle("-fx-border-color: red;");
			validacao++;
		} else {
			endereco.setBairro(bairro);
		}
		if (rua.isEmpty() && rua.isBlank()) {
			txtRua.setStyle("-fx-border-color: red;");
			if(validacao!=0) {
				return null; 
			}
		} else {
			endereco.setRua(rua);
		}
	

	return endereco;

	}

	private void limparBorda() {
		txtRua.setStyle("");
		txtBairro.setStyle("");
		txtCidade.setStyle("");
		txtEstado.setStyle("");
		txtCep.setStyle("");
		txtNome.setStyle("");
		txtCpf.setStyle("");
		txtEmail.setStyle("");
		txtTelefone.setStyle("");
		dataPickerNascimento.setStyle("");
	}

	private void consultarCEP(String cep) {
		try {
			URL url = new URL("https://viacep.com.br/ws/" + cep + "/json/");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");

			if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				StringBuilder responseBuilder = new StringBuilder();
				String line;
				while ((line = br.readLine()) != null) {
					responseBuilder.append(line);
				}
				br.close();

				String response = responseBuilder.toString();
				JSONObject json = new JSONObject(response);
				try {
					String cidade = json.getString("localidade");
					String estado = json.getString("uf");
					String rua = json.getString("logradouro");
					String bairro = json.getString("bairro");
					// Outros campos de endereço

					// Preenche os campos de endereço
					txtCidade.setText(cidade);
					txtEstado.setText(estado);
					txtBairro.setText(bairro);
					txtRua.setText(rua);
				} catch (Exception e) {
					mostrarAlerta("CEP não encontrado");
					// Limpa os campos de endereço em caso de erro
					limparCamposEndereco();
				}

				// Outros campos de endereço
			} else {
				mostrarAlerta("CEP não encontrado");
				// Limpa os campos de endereço em caso de erro
				limparCamposEndereco();
			}

			conn.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void mostrarAlerta(String mensagem) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Informação");
		alert.setHeaderText(null);
		alert.setContentText(mensagem);
		alert.showAndWait();
	}

	private void limparCamposEndereco() {
		txtCidade.setText("");
		txtEstado.setText("");
		txtBairro.setText("");
		txtRua.setText("");
	}
	private void limparCamposCliente() {
		
	}

	@FXML
	private void onCepKeyReleased() {
		String cep = txtCep.getText().trim();
		if (cep.length() == 8 && cep.matches("\\d+")) {
			consultarCEP(cep);
		} else {
			limparCamposEndereco();
		}
	}
	@FXML 
	public void alterarCliente() {
		
		Cliente cliente = setarObjetoCliente();
		Endereco endereco = setarObjetoEndereco();
		if (cliente == null || endereco == null) {
			labelErro.setVisible(true);
			
		} else {
			cliente.setEndereco(endereco);
			//
			
		}
	}
	public void listarClientes() {
		 ObservableList<Cliente> listaClientes = FXCollections.observableArrayList(
		            new Cliente("João", 1234567800l, "joao@email.com"),
		            new Cliente("Maria", 9876542100l , "maria@email.com")
		            
		        );
		 colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
	        colunaCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
	        colunaEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

	        // Preenche a tabela com os dados dos clientes
	        tableCliente.setItems(listaClientes);
	}
}
