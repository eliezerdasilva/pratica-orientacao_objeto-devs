package exemplo01;

public class TesteCarro {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.marca = "Ford";
		carro.modelo = "KA";
		carro.numPassageiros = 5;
		carro.capCombustivel= 60;
		carro.consumoCombustivel = 8;
		
		//simples sem retorno
		carro.exibirCapacidade();
		//com retorno 
		double numeroTotalPassageiro = carro.obterNumPassageiro();
		System.out.println(numeroTotalPassageiro);
		//com paramentro
		double qtdKm = carro.obterKm(10);
		System.out.println(qtdKm);
		
	}
	

}
