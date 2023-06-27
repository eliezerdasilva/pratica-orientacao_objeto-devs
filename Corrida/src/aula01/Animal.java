package aula01;

import java.util.Date;

public class Animal {
	
	// Ctrl + 3
	// Construtor -> gcuf
	// Acessores -> ggas
	
	private String especie;
	private String nome;
	private float peso;
	private float altura;
	private Date dataNascimento;
	
	public Animal(String especie, String nome, float peso, float altura, Date dataNascimento) {
		super();
		this.especie = especie;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.dataNascimento = dataNascimento;
	}
	
	
	
	public void correr() {
		System.out.println("Animal correndo");
	}
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
