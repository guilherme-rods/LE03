package exercicios;

import java.util.Scanner;

import modelos.Automovel;

public class Ex02 {

    public static void executar(){

        System.out.println("Exercício 02:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi a distância total percorrida pelo automóvel? ");
        double distancia = scanner.nextDouble();

        System.out.println("Qual foi a quantidade de combustível gasto (L)? ");
        double combustivel_gasto = scanner.nextDouble();

        Automovel automovel = new Automovel(distancia, combustivel_gasto);

        automovel.imprimirResultado();

        scanner.close();
    }
}