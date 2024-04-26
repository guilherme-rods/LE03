package exercicios;

import java.util.Scanner;

import modelos.Carro;

public class Ex07 {
    public static void executar() {
        System.out.println("Exercício 07:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro: ");
        double custo = scanner.nextDouble();

        Carro carro = new Carro(custo);

        carro.imprimirResultado();

        scanner.close();
    }
}