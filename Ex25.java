//25. Dado o nome de um estudante, com o respectivo número de matrícula e as três notas acima mencionadas, 
//desenvolva um programa para calcular a nota final e a classificação de cada estudante. 
//A classificação é dada conforme a lista abaixo:
//Nota Final Classificação
//[8,10] A
//[7,8] B
//[6,7] C
//[5,6] D
//[0,5] R
//Imprima o nome do estudante, com o seu número, nota final e classificação.

import Classes.Aluno;
import java.util.Scanner;

public class Ex25 {

    public static void executar() {
        System.out.println("Exercício 25:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a matricula do Aluno: ");
        int matricula = scanner.nextInt();
        
        System.out.println("Digite a nota do trabalho de laboratório: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota do exame final ");
        double nota3 = scanner.nextDouble();

        System.out.println("Resultado: ");

        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);

        aluno.imprimirClassificacao();

        scanner.close();
    }
}