package org.example.model;


import org.example.enumerador.Alergia;

import java.sql.Timestamp;
import java.time.LocalDate;

public class Cliente extends Pessoa {
	private Alergia alergias;
	private boolean vip;

	private Timestamp CriedoEm;
	private Timestamp AlteradoEm ;
	private Funcionario CriadoPor;
	private Funcionario AlteradoPor;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(Alergia alergias, boolean vip, Timestamp criedoEm, Timestamp alteradoEm, Funcionario criadoPor, Funcionario alteradoPor) {
		this.alergias = alergias;
		this.vip = vip;
		CriedoEm = criedoEm;
		AlteradoEm = alteradoEm;
		CriadoPor = criadoPor;
		AlteradoPor = alteradoPor;
	}

	public Cliente(int id, String nome, Long cpf, String telefone, Endereco endereco, LocalDate dataNascimento, String observacao, boolean status, Alergia alergias, boolean vip, Timestamp criedoEm, Timestamp alteradoEm, Funcionario criadoPor, Funcionario alteradoPor) {
		super(id, nome, cpf, telefone, endereco, dataNascimento, observacao, status);
		this.alergias = alergias;
		this.vip = vip;
		CriedoEm = criedoEm;
		AlteradoEm = alteradoEm;
		CriadoPor = criadoPor;
		AlteradoPor = alteradoPor;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}	
}
