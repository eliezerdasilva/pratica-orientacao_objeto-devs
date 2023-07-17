package com.example.ravin.model;

import org.example.enumerador.StatusMesa;

import java.sql.Timestamp;
import java.util.List;



public class Mesa {

	private int id;
	private Funcionario atendente;
	private List<Comanda> comandas;
	private int numero;
	private int quantidadePessoas;
	private StatusMesa statusMesa;
	private Timestamp CriedoEm;
	private Timestamp AlteradoEm ;
	private Funcionario CriadoPor;
	private Funcionario AlteradoPor;

	public Mesa() {
		// TODO Auto-generated constructor stub
	}

	public Mesa(int id, Funcionario atendente, List<Comanda> comandas, int numero, int quantidadePessoas, StatusMesa statusMesa, Timestamp criedoEm, Timestamp alteradoEm, Funcionario criadoPor, Funcionario alteradoPor) {
		this.id = id;
		this.atendente = atendente;
		this.comandas = comandas;
		this.numero = numero;
		this.quantidadePessoas = quantidadePessoas;
		this.statusMesa = statusMesa;
		CriedoEm = criedoEm;
		AlteradoEm = alteradoEm;
		CriadoPor = criadoPor;
		AlteradoPor = alteradoPor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Funcionario getAtendente() {
		return atendente;
	}

	public void setAtendente(Funcionario atendente) {
		this.atendente = atendente;
	}

	public List<Comanda> getComandas() {
		return comandas;
	}

	public void setComandas(List<Comanda> comandas) {
		this.comandas = comandas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public StatusMesa getStatusMesa() {
		return statusMesa;
	}

	public void setStatusMesa(StatusMesa statusMesa) {
		this.statusMesa = statusMesa;
	}
}
