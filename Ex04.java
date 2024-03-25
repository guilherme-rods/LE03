//4. Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
//O programa deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.

import Classes.Conversao;
import java.util.Scanner;

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

        scanner.close();
    }
}