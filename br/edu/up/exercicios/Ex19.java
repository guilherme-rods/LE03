package exercicios;

import java.util.Scanner;

import modelos.Triangulo;

public class Ex19 {
    public static void executar() {
        System.out.println("Exercício 19:");

        Scanner scanner = new Scanner(System.in);

        int[] lado = new int[3];

        for(int i = 0; i < lado.length; i++){
            System.out.println("Qual é o comprimento do lado " + (i + 1) + " do triângulo:");
            lado[i] = scanner.nextInt();   
        }

        Triangulo triangulo = new Triangulo(lado[0], lado[1],lado[2]);
        System.out.println(triangulo.definirTriangulo());

        // // scanner.close();
    }
}