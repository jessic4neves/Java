
public class Carro extends Veiculo{
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }
    public void mostrarDetalhes(){
        System.out.printf("Marca: %s%n",getMarca());
        System.out.printf("Modelo: %s%n",getModelo());
    }
}