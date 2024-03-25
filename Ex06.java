//6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda.
//Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.

import Classes.Produto;
import java.util.Scanner;

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