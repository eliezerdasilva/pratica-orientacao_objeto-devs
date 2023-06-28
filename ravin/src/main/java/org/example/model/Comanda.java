package org.example.model;

import org.example.enumerador.FormaPagamento;
import org.example.enumerador.StatusComanda;

import java.sql.Timestamp;
import java.util.List;


public class Comanda {

	private int id;
	private Mesa mesaId;
	private Cliente cliente;
	private List<Pedido> pedidos;
	private float valorTotal;
	private FormaPagamento formaPagamento;
	private StatusComanda statusComanda;
	private Timestamp CriedoEm;
	private Timestamp AlteradoEm ;
	private Funcionario CriadoPor;
	private Funcionario AlteradoPor;

	public Comanda() {
		// TODO Auto-generated constructor stub
	}

	public Comanda(int id, Mesa mesaId, Cliente cliente, List<Pedido> pedidos, float valorTotal, FormaPagamento formaPagamento, StatusComanda statusComanda, Timestamp criedoEm, Timestamp alteradoEm, Funcionario criadoPor, Funcionario alteradoPor) {
		this.id = id;
		this.mesaId = mesaId;
		this.cliente = cliente;
		this.pedidos = pedidos;
		this.valorTotal = valorTotal;
		this.formaPagamento = formaPagamento;
		this.statusComanda = statusComanda;
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

	public Mesa getMesaId() {
		return mesaId;
	}

	public void setMesaId(Mesa mesaId) {
		this.mesaId = mesaId;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public StatusComanda getStatusComanda() {
		return statusComanda;
	}

	public void setStatusComanda(StatusComanda statusComanda) {
		this.statusComanda = statusComanda;
	}

	public Timestamp getCriedoEm() {
		return CriedoEm;
	}

	public void setCriedoEm(Timestamp criedoEm) {
		CriedoEm = criedoEm;
	}

	public Timestamp getAlteradoEm() {
		return AlteradoEm;
	}

	public void setAlteradoEm(Timestamp alteradoEm) {
		AlteradoEm = alteradoEm;
	}

	public Funcionario getCriadoPor() {
		return CriadoPor;
	}

	public void setCriadoPor(Funcionario criadoPor) {
		CriadoPor = criadoPor;
	}

	public Funcionario getAlteradoPor() {
		return AlteradoPor;
	}

	public void setAlteradoPor(Funcionario alteradoPor) {
		AlteradoPor = alteradoPor;
	}
}
