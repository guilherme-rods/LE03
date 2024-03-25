// 2. Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida 
//pelo automóvel e o total de combustível gasto.

import Classes.Automovel;
import java.util.Scanner;

public class Ex02 {

    public static void executar(){

        System.out.println("Exercício 02:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi a distância total percorrida pelo automóvel? ");
        double distancia = scanner.nextDouble();

        System.out.println("Qual foi a quantidade de combustível gasto (L)? ");
        double combustivel_gasto = scanner.nextDouble();

        Automovel automovel = new Automovel(distancia, combustivel_gasto);

        automovel.imprimirResultado();

        scanner.close();
    }
}