package exercicios;

import java.util.Scanner;

import modelos.Carro;

public class Ex15 {

    public static void executar() {
        
        System.out.println("Exercício 15:");

        Scanner scanner = new Scanner(System.in);

        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
        
            System.out.print("Digite o valor do veículo ou 0 para encerrar: ");
            double valorVeiculo = Double.parseDouble(scanner.nextLine());

            if (valorVeiculo == 0) {
                break;
            }

            System.out.print("Digite o tipo de combustível (álcool, gasolina, diesel): ");
            String tipoCombustivel = scanner.nextLine();

            Carro carro = new Carro(tipoCombustivel, valorVeiculo);


            double desconto = carro.calcularDesconto();
            double valorPago = carro.calcularValorPago();

            System.out.println("Desconto: R$" + String.format("%.2f",desconto));
            System.out.println("Valor a ser pago: R$" + String.format("%.2f",valorPago));

            totalDesconto += desconto;
            totalPago += valorPago;
        }

        System.out.println("Total de desconto: R$" + String.format("%.2f",totalDesconto));
        System.out.println("Total pago pelos clientes: R$" + String.format("%.2f",totalPago));

        scanner.close();
    }
}