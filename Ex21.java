//21. Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
//Infantil A = 5 - 7 anos
//Infantil B = 8 - 10 anos
//juvenil A = 11- 13 anos
//juvenil B = 14 - 17 anos
//Sênior = 18 - 25 anos
//Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado.

import Classes.Nadador;
import java.util.Scanner;

public class Ex21 {
    public static void executar() {
        System.out.println("Exercicio 21:");

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Qual é a idade do(a) nadador(a): ---- (Ou digite 0 para encerrar)");
            int idade = scanner.nextInt();

            if(idade == 0){
                break;
            }

            Nadador nadador = new Nadador(idade);

            System.out.println("Categoria: " + nadador.classificarNadador()); 

        } 
        System.out.println("Até o próximo exercício!");
        scanner.close();
    }
}