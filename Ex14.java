//14. Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. 
//Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. 
//Informe média de preço de custo e do preço de venda.

import java.util.Scanner;

import Classes.Produto;

public class Ex14 {

    public static void executar() {
        System.out.println("Exercício 14:");

        Scanner scanner = new Scanner(System.in);

        Produto[] produto = new Produto[4];

        String nome;
        float custo = 0, preco_venda = 0, soma_custo = 0, soma_preco_venda = 0;

        for(int i = 0; i < produto.length; i++){
            System.out.println("Qual é o " + (i + 1) + "º produto:");
            nome = scanner.next();
            produto[i] = new Produto(nome);

            System.out.println("Qual é o preço de custo do " + (i + 1) + "º produto:");
            custo = scanner.nextFloat();
            produto[i] = new Produto(custo);

            System.out.println("Qual é o preço de venda do " + (i + 1) + "º produto:");
            preco_venda = scanner.nextFloat();
            produto[i].setPrecoVenda(preco_venda);
        }

        System.out.println("\nResultados:");

        for (int i = 0; i < produto.length; i++) {
            preco_venda = produto[i].getPrecoVenda();
            custo = produto[i].getCusto();

            if(preco_venda > custo){
                System.out.println("Produto " + (i + 1) + ": Lucro.");
            }else if(preco_venda < custo){
                System.out.println("Produto " + (i + 1) + ": Prejuízo.");
            }else{
                System.out.println("Produto " + (i + 1) + ": Empate.");
            }

            soma_custo += custo;
            soma_preco_venda += preco_venda;

        }

        float media_custo = 0, media_preco_venda = 0;

        media_custo = soma_custo / produto.length;
        media_preco_venda = soma_preco_venda / produto.length;

        System.out.println("\nMédia de preço de custo: " + media_custo);
        System.out.println("Média de preço de venda: " + media_preco_venda);

        scanner.close();
    }

}
