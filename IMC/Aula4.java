package Aula4;

import java.util.Scanner;

public class Aula4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Pessoa ps = new Pessoa();
        System.out.println("Digite um peso ");
        ps.setPeso(s.nextInt());

        System.out.println("Digite sua altura: ");
        ps.setAltura(s.nextDouble());

        System.out.println(ps.getAltura());



        System.out.println(ps.imc(ps.getPeso(),ps.getAltura()));

    }
}
