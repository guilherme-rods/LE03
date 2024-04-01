//20. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. 
//Faça um programa que calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
//Professor Nível 1 R$12,00 por hora/aula
//Professor Nível 2 R$17,00 por hora/aula
//Professor Nível 3 R$25,00 por hora/aula

import Classes.Professor;
import java.util.Scanner;

public class Ex20 {

    public static void executar() {
        System.out.println("Exercício 20:");

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Qual é o nome do(a) professor(a)? ---- (Ou digite 'fim' para encerrar)");
            String nome = scanner.next();

            if(nome.equalsIgnoreCase("fim")){
                break;
            }

            System.out.println("Qual o nível do(a) professor(a) (1, 2 ou 3):");
            int nivel = scanner.nextInt();

            System.out.println("Quantas horas/aula o(a) professor(a) trabalhou:");
            double horasTrabalhadas = scanner.nextDouble();

            Professor professor = new Professor(nome, nivel, horasTrabalhadas);

            professor.calcularSalario();
            professor.imprimirResultado();
        }
        System.out.println("Até o próximo exercício!");
        scanner.close();
    }
}