package exercicios;

import java.util.Scanner;

import modelos.Funcionario;

public class Ex18 {

    public static void executar() {
        System.out.println("Exercício 18:");

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Qual é o nome do(a) funcionário(a)? ---- (Ou digite 'fim' para encerrar)");
            String nome = scanner.next();

            if(nome.equalsIgnoreCase("fim")){
                break;
            }

            System.out.println("Qual é a idade do(a) funcionário(a)?");
            int idade = scanner.nextInt();

            System.out.println("Qual é o sexo do(a) funcionário(a) (M/F)?");
            String sexo = scanner.next();

            System.out.println("Qual é o salário atual do funcionário?");
            double salarioAtual = scanner.nextDouble();

            Funcionario funcionario = new Funcionario(nome, idade, sexo, salarioAtual);

            funcionario.calcularAbono();

            funcionario.imprimirResultadoAbono();
        }
        System.out.println("Até o próximo exercício: ");
        scanner.close();
    }
}