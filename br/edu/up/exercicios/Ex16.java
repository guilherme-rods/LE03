package exercicios;

import java.util.Scanner;

import modelos.Funcionario;

public class Ex16 {

    public static void executar() {
        
        System.out.println("Exercício 16:");

        Scanner scanner = new Scanner(System.in);

        while(true){
                int i = 0;
                double salarioMin = 1412.00;
                System.out.println("Qual é o salário atual do funcionário " + (i + 1) + "? ---- (digite 0 para encerrar)");
                double salarioAtual = scanner.nextDouble();

                if(salarioAtual == 0){
                    break;
                }

                Funcionario funcionario = new Funcionario(salarioAtual, salarioMin);
                System.out.println("O salário mínimo atual é R$" + funcionario.getSalarioMin());

                funcionario.calcularReajuste();
                funcionario.imprimirSalReajustado();
        }

        System.out.println("Até o próximo exercício: ");
        scanner.close();  
    }
}