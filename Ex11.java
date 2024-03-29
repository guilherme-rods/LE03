//11. Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher. 
//No final informe total de homens e de mulheres.

import java.util.Scanner;

import Classes.Pessoa;

public class Ex11 {

    public static void executar() {
        System.out.println("Exercício 11:");

        Scanner scanner = new Scanner(System.in);

        Pessoa [] pessoa = new Pessoa[5];

        String nome, sexo;
        int contador = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Qual o nome da " + (i + 1) + "º pessoa:");
            nome = scanner.nextLine();
            pessoa[i] = new Pessoa(nome);

            System.out.println("Qual o sexo da " + (i + 1) + "º pessoa (Homem ou Mulher):");
            sexo = scanner.nextLine();
            pessoa[i].setSexo(sexo);
            
            if(sexo.toUpperCase().equals("HOMEM")){
                contador++;
            }
        }

        System.out.println("No total são " + (pessoa.length - contador) + " mulheres e " + contador + " homens!");

        scanner.close();
    }
}