package exemplo01;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	 
	

	void exibirCapacidade() {
		System.out.println("capacidade de passageiros "+ numPassageiros);
	}
	double obterNumPassageiro() {
		return numPassageiros -1;
	}
	double obterKm(double km) {
		double soma = km * consumoCombustivel;
		return soma;
	}
}
