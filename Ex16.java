//16. Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo com os seguintes critérios:
//a) 50% para aqueles que ganham menos do que três salários mínimos;
//b) 20% para aqueles que ganham entre três até dez salários mínimos;
//c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;
//d) 10% para os demais funcionários.

import Classes.Funcionario;
import java.util.Scanner;

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