package Classes;

public class Funcionario {

    private int id;
    private String nome;
    private int CPF;
    private double salarioAtual;
    private double salarioMin = 1412.00;

    public Funcionario(double salarioAtual){
        this.salarioAtual = salarioAtual;
    }

    public double calcularReajuste(){
        if(salarioAtual < (3 * salarioMin)){
            return salarioAtual * (1 + 0.50);
        }else if(salarioAtual <= (10 * salarioMin)){
            return salarioAtual * (1 + 0.20);
        }else if(salarioAtual > (10 * salarioMin)){
            return salarioAtual * (1 + 0.15);
        }else{
            return salarioAtual * (1 + 0.1);
        }
    }

    public void imprimirSalReajustado(){
        System.out.println("Salário reajustado: R$" + String.format("%.2f", calcularReajuste()));
    }


    
}
