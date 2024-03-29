package Classes;

import java.util.Scanner;

public class Contador {

    private int [] num = new int [80];

    public Contador(int[] numero){
        this.num = numero;
    }

    public int contarNumeros(){

        int contador = 0;

        for( int i = 0; i < num.length; i++){

            if(10 <= num[i] && num[i] <= 150){
                contador++;
            }
        }
        return contador;
    }

    public void imprimirResultado(){
        System.out.println("\nA quantidade de número entre 10 e 150 é: " + contarNumeros());
    }
}