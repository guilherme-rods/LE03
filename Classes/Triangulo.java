package Classes;

public class Triangulo {

    private String nome;
    private int[] lado = new int[3];
   
    public Triangulo(int lado1, int lado2, int lado3){
        this.lado[0] = lado1;
        this.lado[1] = lado2;
        this.lado[2] = lado3;
    }

    public boolean conferirTriangulo() {
        return lado[0] < lado[1] + lado[2] && lado[1] < lado[0] + lado[2] && lado[2] < lado[0] + lado[1];
    }

    public String definirTriangulo(){
        if(!conferirTriangulo()){
            return "Os lados informados não formam um triângulo!";
        }
        else if(lado[0] == lado[1] && lado[1] == lado[2]){
            return "Triângulo Equilátero";
        }else if(lado[0] == lado[1] || lado[1] == lado[2] || lado[2] == lado[0]){
            return "Triângulo Isóceles";
        }else{
            return "Triângulo Escaleno";
        }
    }




    
}
