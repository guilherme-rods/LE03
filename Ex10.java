//10. Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem informando “maior de idade” e 
//“menor de idade” para cada pessoa. Considerar a pessoa com 18 anos como maior de idade.

import Classes.Pessoa;

import java.util.Scanner;

public class Ex10 {

    public static void executar() {
        
        System.out.println("Exercício 10:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Defina a quantidade de pessoas: ");
        int qtde = scanner.nextInt();

        Pessoa[] pessoa = new Pessoa[qtde];

        int idade;

        for(int i = 0; i < qtde; i++){
            System.out.println("Qual é a idade da " + (i + 1) + "º pessoa:");
            idade = scanner.nextInt();
            pessoa[i] = new Pessoa(idade);
        }

        for(int i = 0; i < qtde; i++){
            if(pessoa[i].getIdade() >= 18){
                System.out.println("A " + (i + 1) + "º pessoa é maior de idade.");
            }else{
                System.out.println("A " + (i + 1) + "º pessoa é menor de idade.");
            }
        }
        scanner.close();
    }
}