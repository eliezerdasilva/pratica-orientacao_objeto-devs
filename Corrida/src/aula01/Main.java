package aula01;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Girafa girafales = new Girafa();
		girafales.setPeso(100);
		girafales.setAltura(30);
		girafales.setNome("Girafales");
		girafales.setEspecie("GIRAFUS LONGUS");
		girafales.setDataNascimento(new Date());
		girafales.setVelocidade(10);
		girafales.setQuantidadePatas(3);

		Girafa melman = new Girafa(23);
		melman.setPeso(120);
		melman.setAltura(34);
		melman.setNome("melman");
		melman.setEspecie("GIRAFUS LONGUS");
		melman.setDataNascimento(new Date());
		melman.setVelocidade(20);
		melman.setQuantidadePatas(4);

		Elefante meny = new Elefante();
		meny.setAltura(8);
		meny.setDataNascimento(new Date());
		meny.setEspecie("ELEFANTUS");
		meny.setMotivacao(true);
		meny.setNome("Meny");
		meny.setPeso(500);
		meny.setTamanhoPresa(2);

		Pista pista1 = new Pista();
		pista1.setNome("Interlagos");
		pista1.setComprimento(2.5f);
		
		List<Animal> listaCompetidores = new ArrayList<Animal>();
		listaCompetidores.add(melman);
		listaCompetidores.add(girafales);
		listaCompetidores.add(meny);
		
		Corrida corrida = new Corrida();
		corrida.setQuantidadeVoltas((byte) 2);
		corrida.setPista(pista1);
		corrida.setCompetidores(listaCompetidores);
		
		corrida.iniciarCorrida();
	}

}
