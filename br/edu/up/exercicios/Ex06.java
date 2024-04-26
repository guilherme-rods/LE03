package exercicios;

import java.util.Scanner;

import modelos.Produto;

public class Ex06 {

    public static void executar() {
        System.out.println("Exercício 06:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de Custo do produto: ");
        float custo = scanner.nextFloat();

        System.out.println("Digite o percentual de acréscimo do produto: ");
        float acrescimo = scanner.nextFloat();

        Produto produto = new Produto(custo, acrescimo);

        produto.imprimirResultado();

        scanner.close();
    }
}