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
            case 2:
                Ex02.executar();
                break;
            case 3:
                Ex03.executar();
                break;
            case 4:
                Ex04.executar();
                break;
            case 5:
                Ex05.executar();
                break;
            case 6:
                Ex06.executar();
                break;
            case 7:
                Ex07.executar();
                break;
            case 8:
                Ex08.executar();
                break;
            case 9:
                Ex09.executar();
                break;
            case 10:
                Ex10.executar();
                break;
            case 11:
                Ex11.executar();
                break;
            case 12:
                Ex12.executar();
                break;
            case 13:
                Ex13.executar();
                break;
            case 14:
                Ex14.executar();
                break;
            case 15:
                Ex15.executar();
                break;
            case 16:
                Ex16.executar();
                break;
        
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}