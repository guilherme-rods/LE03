package exercicios;

//9. Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive).
import java.util.Scanner;

import modelos.Contador;

public class Ex09 {

    public static void executar() {
        
        System.out.println("Exercício 09:");

        Scanner scanner = new Scanner(System.in);

        int [] num = {178, 37, 143, 9, 59, 197, 85, 123, 163, 110, 89, 68, 87, 93, 144, 56, 2, 35, 
            179, 114, 123, 135, 20, 53, 33, 17, 182, 127, 89, 23, 131, 59, 67, 51, 71, 58, 74, 18, 82, 26, 51, 177, 15, 73, 6, 
            48, 10, 142, 72, 121, 17, 41, 38, 19, 124, 78, 150, 83, 5, 183, 84, 27, 35, 133, 1, 36, 161, 168, 75, 139, 74, 7, 198, 12, 
            174, 9, 166, 52, 176, 78, 106};
        
        System.out.println("Os 80 números escolhidos são: ");

        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + ", ");
        }
        

        Contador contador = new Contador(num);
        contador.contarNumeros();

        contador.imprimirResultado();

        // // scanner.close();
    }
}