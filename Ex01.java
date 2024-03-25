//1. Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
//No final informar o nome do aluno e a sua média (aritmética).
import Classes.Aluno;
import java.util.Scanner;

public class Ex01 {

    public static void executar() {

        System.out.println("Exercício 01:");

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

        aluno.imprimirResultado();

        scanner.close();
    }
}