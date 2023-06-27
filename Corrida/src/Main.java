
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Girafa animal = new Girafa();
        animal.setPeso(100);
        animal.setAltura(30);
        animal.setNome("Girafales");
        animal.setEspecie("Girafus  Loguns");
        animal.setDataNascimento(new Date());






        Corrida corrida = new Corrida();
        Pista pista = new Pista();
        pista.setNome("Interlagos");
        pista.setComprimento(2.5f);

        List<Animal> listaCompeditores = new ArrayList<Animal>();
        listaCompeditores.add(animal);

        corrida.setQuantidadeVoltas((byte) 2.6);
        corrida.setPista(pista);
        corrida.setCompetidores(null);

        System.out.println("hhh");


    }
}