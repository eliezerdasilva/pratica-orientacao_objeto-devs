public class Girafa extends Animal{
    double velocidade;
    int quantidadePatas;
    double energia ;


    public Girafa() {


    }
    public Girafa(double altura){
        this.energia = 10;

        System.out.println("Girafa criada");

    }

    public Girafa(double altura, double velocidade, int quantidadePatas, double energia) {
        this.velocidade = velocidade;
        this.quantidadePatas = quantidadePatas;
        this.energia = energia;
    }

    public void correr(){
        System.out.println("Girafa"+getNome()+"Correndo");
    }
    public void andar(){
        System.out.println("Girafa"+getNome()+"andando");
    }
    public double calcularVelocidade(){
       this.velocidade = ((energia * getPeso() )/quantidadePatas)/ 50;
        return velocidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }


    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }
}
