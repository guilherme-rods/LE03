//8. Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre. 
//Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e 
//Recuperação (media entre 5.1 a 6.9).

import java.util.Scanner;

import Classes.Aluno;

public class Ex08 {

    public static void executar() {

        System.out.println("Exercício 08:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Resultado: ");

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        aluno.imprimirAprovacao();

        scanner.close();
    }

}
