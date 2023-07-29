package aula01;

import java.util.List;

public class Corrida {

	private Pista pista;

	private List<Animal> competidores;

	private byte quantidadeVoltas;

	public Corrida() {

	}

	public Corrida(Pista pista, List<Animal> competidores, byte quantidadeVoltas) {
		this.pista = pista;
		this.competidores = competidores;
		this.quantidadeVoltas = quantidadeVoltas;
	}

	public void iniciarCorrida() {
		for (Animal competidor : competidores) {
			competidor.correr();
		}
	}

	public Pista getPista() {
		return pista;
	}

	public void setPista(Pista pista) {
		this.pista = pista;
	}

	public List<Animal> getCompetidores() {
		return competidores;
	}

	public void setCompetidores(List<Animal> competidores) {
		this.competidores = competidores;
	}

	public byte getQuantidadeVoltas() {
		return quantidadeVoltas;
	}

	public void setQuantidadeVoltas(byte quantidadeVoltas) {
		this.quantidadeVoltas = quantidadeVoltas;
	}
}
