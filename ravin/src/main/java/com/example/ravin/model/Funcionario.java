package com.example.ravin.model;


import com.example.ravin.enumerador.Cargo;
import com.example.ravin.enumerador.Disponibilidade;
import com.example.ravin.enumerador.Escolaridade;
import com.example.ravin.enumerador.EstadoCivil;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

public class Funcionario extends Pessoa {

    private int rg;

    private Long numCArteiraTrabalho;
    private EstadoCivil estadoCivil;
    private Escolaridade escolaridade;
    private Cargo cargo;
    private int pis;
    private Date dataAdmissao;
    private Date dataDemissao;
    private Disponibilidade disponibilidade;
    private Usuario usuario;

    public Funcionario() {
        // TODO Auto-generated constructor stub
    }

    public Funcionario(int id, String nome, Long cpf, String telefone, Endereco endereco, LocalDate dataNascimento, String observacao, boolean status, int rg, Long numCArteiraTrabalho, EstadoCivil estadoCivil, Escolaridade escolaridade, Cargo cargo, int pis, Date dataAdmissao, Date dataDemissao, Disponibilidade disponibilidade, Timestamp criedoEm, Timestamp alteradoEm, Funcionario criadoPor, Funcionario alteradoPor, Usuario usuario) {
        super(id, nome, cpf, telefone, endereco, dataNascimento, observacao, status);
        this.rg = rg;
        this.numCArteiraTrabalho = numCArteiraTrabalho;
        this.estadoCivil = estadoCivil;
        this.escolaridade = escolaridade;
        this.cargo = cargo;
        this.pis = pis;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
        this.disponibilidade = disponibilidade;
        this.usuario = usuario;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getPis() {
        return pis;
    }

    public void setPis(int pis) {
        this.pis = pis;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public Long getNumCArteiraTrabalho() {
        return numCArteiraTrabalho;
    }

    public void setNumCArteiraTrabalho(Long numCArteiraTrabalho) {
        this.numCArteiraTrabalho = numCArteiraTrabalho;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
