package com.example.ravin.model;




import com.example.ravin.enumerador.Alergia;

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

    public Alergia getAlergias() {
        return alergias;
    }

    public void setAlergias(Alergia alergias) {
        this.alergias = alergias;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Timestamp getCriedoEm() {
        return CriedoEm;
    }

    public void setCriedoEm(Timestamp CriedoEm) {
        this.CriedoEm = CriedoEm;
    }

    public Timestamp getAlteradoEm() {
        return AlteradoEm;
    }

    public void setAlteradoEm(Timestamp AlteradoEm) {
        this.AlteradoEm = AlteradoEm;
    }

    public Funcionario getCriadoPor() {
        return CriadoPor;
    }

    public void setCriadoPor(Funcionario CriadoPor) {
        this.CriadoPor = CriadoPor;
    }

    public Funcionario getAlteradoPor() {
        return AlteradoPor;
    }

    public void setAlteradoPor(Funcionario AlteradoPor) {
        this.AlteradoPor = AlteradoPor;
    }

	
}
