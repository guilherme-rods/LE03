//24. Em um curso de Ciência da Computação a nota do estudante é calculada a partir de três notas atribuídas, respectivamente, 
//a um trabalho de laboratório, a uma avaliação semestral e a um exame final. As notas variam, de 0 a 10 e a nota final 
//é a média ponderada das três notas mencionadas. A lista abaixo fornece os pesos:
//a. Laboratório: peso 2
//b. Avaliação semestral: peso 3
//c. Exame final: peso 5

import Classes.Aluno;
import java.util.Scanner;

public class Ex24 {
    public static void executar() {

        System.out.println("Exercício 24:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho de laboratório: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota do exame final ");
        double nota3 = scanner.nextDouble();

        System.out.println("Resultado: ");

        Aluno aluno = new Aluno(nota1, nota2, nota3);

        aluno.calculoMediaPonderada();
        aluno.imprimirMediaPonderada();

        scanner.close();
    }
}