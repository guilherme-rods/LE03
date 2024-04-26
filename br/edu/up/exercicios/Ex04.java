package exercicios;

import java.util.Scanner;

import modelos.Conversao;

public class Ex04 {

    public static void executar() {
        System.out.println("Exercício 04:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o valor da cotação atual do dólar?");
        double cotacao = scanner.nextDouble();

        System.out.println("Qual é o valor disponível em dólar?");
        double dolar = scanner.nextDouble();

        Conversao conversao = new Conversao(cotacao, dolar);

        conversao.imprimirResultado();

        // // scanner.close();
    }
}