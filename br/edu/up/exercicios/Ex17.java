package exercicios;
//17. Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário reajustado. 
//Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento.

import java.util.Scanner;

import modelos.Funcionario;

public class Ex17 {

    public static void executar() {
        System.out.println("Exercício 17:");

        Scanner scanner = new Scanner(System.in);

        double totalReajuste = 0;

        while(true){
            System.out.println("Qual é o nome do funcionário? ---- (Ou digite 'fim' para encerrar)");
            String nome = scanner.next();

            if(nome.equalsIgnoreCase("fim")){
                break;
            }

            System.out.println("Qual é o salário atual do funcionário?");
            double salarioAtual = scanner.nextDouble();
            Funcionario funcionario = new Funcionario(nome, salarioAtual);

            System.out.println("Valor do salário mínimo atual: R$" + funcionario.getSalarioMin());

            funcionario.calcularReajuste();
            funcionario.imprimirResultado();

            totalReajuste += (funcionario.calcularReajuste() - salarioAtual);
        }

        System.out.println("A folha de pagamento aumentou em R$ " + totalReajuste);
    
        // // scanner.close();
    }
}