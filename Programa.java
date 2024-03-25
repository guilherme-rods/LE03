import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args){

        System.out.println("LE03 - Guilherme Rodrigues:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qual exercício quer verificar:");
        int exercicio = scanner.nextInt();

        switch (exercicio) {
            case 1:
                Ex01.executar();
                break;
        
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
