package exercicios;

import java.util.Scanner;

import modelos.Pessoa;

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

        // // scanner.close();
    }
}