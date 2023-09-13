package Aula4;

public class Pessoa {
    private int peso;

    private double altura;

    public double imc1;


    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double imc (int peso, double altura) {
        this.peso = peso;
        this.altura = altura;

        imc1 = peso / (altura*altura);
        return imc1;

    }

}
