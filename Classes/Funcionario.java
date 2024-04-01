package Classes;

public class Funcionario {

    private int id;
    private String nome;
    private int CPF;
    private double salarioAtual;
    private double salarioMin = 1412.00;

    public Funcionario(double salarioAtual, double salarioMin){
        this.salarioAtual = salarioAtual;
        this.salarioMin = salarioMin;
    }


    public Funcionario(String nome){
        this.nome = nome;
    }


    public Funcionario(String nome, double salarioAtual){
        this.nome = nome;
        this.salarioAtual = salarioAtual;
    }

    public double getSalarioMin(){
        return salarioMin;
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

    public void imprimirResultado(){
        System.out.println("Resultado:");
        System.out.println("Nome do funcionário(a): " + nome);
        System.out.println("Valor do reajuste: R$" + (calcularReajuste() - salarioAtual));
        System.out.println("Novo salário: R$" + calcularReajuste());
    }


    
}
