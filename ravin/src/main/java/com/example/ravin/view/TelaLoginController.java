/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.example.ravin.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaLoginController implements Initializable {

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {

	}

	@FXML
	private Button buttonEfetuarLogin;

	@FXML
	private Label labelErro;

	@FXML
	private TextField txtSenha;

	@FXML
	private TextField txtUsuario;

	@FXML
	public void efetuarLogin() {

		String usuario = txtUsuario.getText();
		String senha = txtSenha.getText();
		if ((usuario.isEmpty() && usuario.isBlank()) && (senha.isEmpty() && senha.isBlank())) {
			txtUsuario.setStyle("-fx-border-color: red;");
		} else {
			// conexao banco

		}

	}

	private void abrirTelaPrincipal(String usuario, String senha) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaMenu.fxml"));
			Parent root = loader.load();

			TelaMenuController telaMenuController = loader.getController();

			telaMenuController.setUsuarioSenha(usuario, senha);

			Stage stage = new Stage();

			Scene scene = new Scene(root);
			stage.setScene(scene);

			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
