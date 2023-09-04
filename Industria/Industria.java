public class Industria {
    int matricula;
    String nome;
    int salarioBruto;
    int descontoInss;
    int salarioFinal;

    public int deducaoInss(){
        salarioFinal = salarioBruto - ((salarioBruto * descontoInss) / 100);
        return salarioFinal;
    }


    public void descricao(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Dedução do Inss: "+ descontoInss);
        System.out.println("Salario fina: " + salarioFinal);
    }

}