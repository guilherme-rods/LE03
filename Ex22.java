//22. Faça um programa que calcule o valor da conta de luz de uma pessoa. 
//Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
//Tipo de Cliente Valor do KW/h
//1 (Residência) 0,60
//2 (Comércio) 0,48
//3 (Indústria) 1,29

import Classes.ContaDeLuz;
import java.util.Scanner;

public class Ex22 {

    public static void executar() {
        System.out.println("Exercício 22:");

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Qual é o tipo de cliente? (Digite: 1 para Residência, 2 para Comércio, 3 para Indústria ou 0 para encerrar).");
            int tipoCliente = scanner.nextInt();

            if( tipoCliente == 0){
                break;
            }

            System.out.println("Qual é o consumo de energia em Kw/h?");
            double consumo = scanner.nextDouble();

            ContaDeLuz contaDeLuz = new ContaDeLuz(tipoCliente, consumo);

            contaDeLuz.calcularValorLuz();
            contaDeLuz.imprimirResultado();
        }
        System.out.println("Até o próximo exercício!");
        scanner.close();
    }
}