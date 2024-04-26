package exercicios;
//26. Uma seguradora possui nove categorias de seguro baseadas na idade e ocupação do segurado. 
//Somente pessoas com pelo menos 17 anos e não mais que 70 anos podem adquirir apólices de seguro. 
//Quanto às classes de ocupações, foram definidos três grupos de risco: baixo, médio e alto. 
//A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco. 
//Dados nome, idade e grupo de risco de um pretendente, determinar e imprimir seus dados e categoria. 
//Caso a idade não esteja na faixa necessária, imprimir uma mensagem informando que ele não se enquadra 
//em nenhuma das categorias ofertadas.

import java.util.Scanner;

import modelos.Pessoa;

public class Ex26 {
    public static void executar() {
        System.out.println("Exercício 26:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o nome do segurado:");
        String nome = scanner.next();

        System.out.println("Qual é a idade do segurado:");
        int idade = scanner.nextInt();

        System.out.println("Em que grupo de risco se encontra o segurado: (Baixo[B], Médio[M], Alto[A]):");
        char grupoDeRisco = scanner.next().toUpperCase().charAt(0);

        Pessoa pessoa = new Pessoa(nome, idade, grupoDeRisco);

        pessoa.imprimirCategoria();

        // // scanner.close();
    }
}