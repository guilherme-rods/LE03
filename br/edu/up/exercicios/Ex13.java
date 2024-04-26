package exercicios;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

import modelos.Pessoa;

public class Ex13 {

    public static void executar() {

        System.out.println("Exercício 13:");
        
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        int totalAptos = 0;
        int totalInaptos = 0;

        System.out.println("Informe o número de pessoas:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Informe o nome da pessoa " + i + ":");
            String nome = scanner.next();

            System.out.println("Informe o sexo da pessoa " + i + " (M/F):");
            char sexo = scanner.next().charAt(0);

            System.out.println("Informe a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();

            System.out.println("Informe a saúde da pessoa " + i + " (True/False):");
            boolean saude = scanner.nextBoolean();

            Pessoa pessoa = new Pessoa(nome, nome, idade, saude);
            pessoas.add(pessoa);
        }

        for (Pessoa pessoa : pessoas) {
            if (pessoa.aptoServicoMilitar()) {
                System.out.println(pessoa.getNome() + " está apto para o serviço militar obrigatório.");
                totalAptos++;
            } else {
                System.out.println(pessoa.getNome() + " não está apto para o serviço militar obrigatório.");
                totalInaptos++;
            }
        }

        System.out.println("Total de pessoas aptas: " + totalAptos);
        System.out.println("Total de pessoas inaptas: " + totalInaptos);

        scanner.close();
    }
}