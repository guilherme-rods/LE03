package exercicios;

import java.util.Scanner;

import modelos.Compra;

public class Ex05 {

    public static void executar() {
        
        System.out.println("Exercício 05:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        float valor_compra = scanner.nextFloat();

        Compra compra = new Compra(valor_compra);

        compra.imprimirResultado();

        scanner.close();
    }
}