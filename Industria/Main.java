import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Industria indus = new Industria();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a matricula: ");
        indus.matricula = sc.nextInt();
        System.out.println("Informe o nome do funcionario: ");
        indus.nome = sc.next();

        System.out.println("Informe o Salario Bruto: ");
        indus.salarioBruto = sc.nextInt();
        System.out.println("Desconto do inss: ");
        indus.descontoInss = sc.nextInt();

        indus.deducaoInss();
        indus.descricao();

    }
}