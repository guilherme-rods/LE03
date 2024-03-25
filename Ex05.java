//5. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. 
//Faça um programa que receba um valor de uma compra e mostre o valor das prestações.

import Classes.Compra;
import java.util.Scanner;

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