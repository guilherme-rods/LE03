//7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos 
//(aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado). 
//Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica 
//de um carro e informe o custo ao consumidor do mesmo.

import Classes.Carro;
import java.util.Scanner;

public class Ex07 {
    public static void executar() {
        System.out.println("Exercício 07:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro: ");
        double custo = scanner.nextDouble();

        Carro carro = new Carro(custo);

        carro.imprimirResultado();

        scanner.close();
    }
}