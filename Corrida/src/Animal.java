import java.util.Date;

public  class  Animal {

    private String especie;
    private float peso;
    private String nome;
    private float altura;
    private Date dataNascimento;

    public Animal() {
    }

    public Animal(String especie, float peso, String nome, float altura, Date dataNascimento) {
        this.especie = especie;
        this.peso = peso;
        this.nome = nome;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void correr() {
        System.out.println("Correr");
    }
}
