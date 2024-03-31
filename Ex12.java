//12. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. 
// Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. 
// O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. 
// O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
// Informar total de carros com ano até 2000 e total geral.

import java.util.Scanner;

import Classes.Carro;

public class Ex12 {

    public static void executar() {
        System.out.println("Exercício 12:");

        Scanner scanner = new Scanner(System.in);

        int carrosAte2000 = 0;
        int carrosAcima2000 = 0;

        while(true){
            System.out.println("Qual é o ano do veículo? ");
            int ano = scanner.nextInt();

            System.out.println("Informe o valor do veículo: ");
            double valor = scanner.nextDouble();
            
            Carro carro = new Carro(ano, valor);

            double desconto = carro.mostrarDesconto();
            double valorComDesconto = carro.calcularValorComDesconto();

            System.out.println("Desconto: " + (desconto * 100) + "%");
            System.out.println("Valor a ser pago: R$" + valorComDesconto);

            if (ano <= 2000) {
                carrosAte2000++;
            }else{
                carrosAcima2000++;
            }
            System.out.println("Deseja continuar calculando desconto? (S/N)");
            String continuar = scanner.next();
            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("Total de carros com ano até 2000: " + carrosAte2000);
        System.out.println("Total de carros com ano acima de 2000: " + carrosAcima2000);
        
        scanner.close();
    }
}