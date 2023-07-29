package aula01;

import java.util.Date;

public class Onitorinco extends Animal implements Oviparo, Mamifero{

    private float tamanhoBico;
    private float tamanhoCauda;
    public boolean  temVeneno;

    public Onitorinco() {
    }

    public Onitorinco(String especie, String nome, float peso, float altura, Date dataNascimento, float tamanhoBico, float tamanhoCauda, boolean temVeneno) {
        super(especie, nome, peso, altura, dataNascimento);
        this.tamanhoBico = tamanhoBico;
        this.tamanhoCauda = tamanhoCauda;
        this.temVeneno = temVeneno;
    }

    public float getTamanhoBico() {
        return tamanhoBico;
    }

    public void setTamanhoBico(float tamanhoBico) {
        this.tamanhoBico = tamanhoBico;
    }

    public float getTamanhoCauda() {
        return tamanhoCauda;
    }

    public void setTamanhoCauda(float tamanhoCauda) {
        this.tamanhoCauda = tamanhoCauda;
    }

    public boolean isTemVeneno() {
        return temVeneno;
    }

    public void setTemVeneno(boolean temVeneno) {
        this.temVeneno = temVeneno;
    }

    @Override
    public void botarOvo() {

    }

    @Override
    public void chocaOvo() {

    }

    @Override
    public void mamar() {

    }
}
