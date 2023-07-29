import java.util.List;

public class Corrida {
    private byte quantidadeVoltas;
    private Pista pista ;
    private List<Animal> competidores;

    public Corrida() {
    }
    public void iniciarCorrida(){
        for (Animal animal : competidores) {
            animal.correr();
        }
    }

    public Corrida(byte quantidadeVoltas, Pista pista, List<Animal> competidores) {
        this.quantidadeVoltas = quantidadeVoltas;
        this.pista = pista;
        this.competidores = competidores;
    }

    public byte getQuantidadeVoltas() {
        return quantidadeVoltas;
    }

    public void setQuantidadeVoltas(byte quantidadeVoltas) {
        this.quantidadeVoltas = quantidadeVoltas;
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
}
