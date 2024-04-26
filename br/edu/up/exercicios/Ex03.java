package exercicios;

import java.util.Scanner;

import modelos.Vendedor;

public class Ex03 {

    public static void executar() {
        
        System.out.println("Exercício 03:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor: ");
        double salario_fixo = scanner.nextDouble();

        System.out.println("Digite o valor total das vendas efetuadas no mês: ");
        double vendas = scanner.nextDouble();

        Vendedor vendedor = new Vendedor(nome, salario_fixo, vendas);

        vendedor.imprimirResultado();

        // // scanner.close();
    }
}