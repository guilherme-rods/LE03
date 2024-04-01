package Classes;

public class Professor {

    private int nivel;
    private String nome;
    private double horasTrabalhadas;

    public Professor(String nome, int nivel, double horasTrabalhadas){
        this.nome = nome;
        this.nivel = nivel;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalario(){
        if(nivel == 1){
            return horasTrabalhadas * 12.00;
        }else if(nivel == 2){
            return horasTrabalhadas * 17.00;
        }else{
            return horasTrabalhadas * 25.00;
        }
    }

    public void imprimirResultado(){
        System.out.println("Salário: R$" + calcularSalario());
    }
}