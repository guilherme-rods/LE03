package exercicios;

import java.util.Scanner;

import modelos.Aluno;

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
