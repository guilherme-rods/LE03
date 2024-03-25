//3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês 
//(em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
//informar o seu nome, o salário fixo e salário no final do mês.

import Classes.Vendedor;
import java.util.Scanner;

public class Ex03 {

    public static void executar() {
        
        System.out.println("Exercício 03:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor: ");
        double salario_fixo = scanner.nextDouble();

        System.out.println("Digite o valor total das vendas efetuadas no mês: ");
        double vendas = scanner.nextDouble();

        Vendedor vendedor = new Vendedor(nome, salario_fixo, vendas);

        vendedor.imprimirResultado();

        scanner.close();
    }
}