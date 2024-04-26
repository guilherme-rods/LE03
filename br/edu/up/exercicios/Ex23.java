package exercicios;
//23. Faça um programa que leia o nome, o sexo, a altura e a idade de uma pessoa. 
//Calcule e mostre nome e o seu peso ideal de acordo com as seguintes características da pessoa:

import java.util.Scanner;

import modelos.Pessoa;

public class Ex23 {
    public static void executar() {
        System.out.println("Exercício 23:");

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Qual é o nome da pessoa: ---- (Ou digite 'fim' para encerrar)");
            String nome = scanner.next();

            if(nome.equalsIgnoreCase("fim")){
                break;
            }

            System.out.println("Qual é o sexo da pessoa (M/F):");
            String sexo = scanner.next();

            System.out.println("Qual é a altura da pessoa:");
            double altura = scanner.nextDouble();

            System.out.println("Qual é a idade da pessoa:");
            int idade = scanner.nextInt();

            Pessoa pessoa = new Pessoa(nome, sexo, altura, idade);

            pessoa.calcularPesoIdeal();
            pessoa.imprimirResultado();
        }
        System.out.println("Até o próximo exercício!");
        scanner.close();
    }
}