package aula01;

public class Girafa extends Animal {

	private double velocidade;
	private int energia;
	private int quantidadePatas;

	// Método CONSTRUTOR
	public Girafa(float altura) {
		this.energia = 10;
		super.setAltura(altura);
		System.out.println("Girafa criada com a altura ");
	}

	public Girafa() {
		System.out.println("Girafa criada");
	}

	@Override
	public void correr() {
		System.out.println("Girafa " + super.getNome() + " correndo");
	}

//	public void andar() {
//		System.out.println("Girafa " + super.getNome() + " andando");
//	}

	public double calcularVelocidade() {
		this.velocidade = ((energia * super.getPeso()) / quantidadePatas) / 50;
		return velocidade;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getQuantidadePatas() {
		return quantidadePatas;
	}

	public void setQuantidadePatas(int quantidadePatas) {
		this.quantidadePatas = quantidadePatas;
	}
}
