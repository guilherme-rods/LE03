package Classes;

public class Funcionario {

    private int idade;
    private String nome;
    private String sexo;
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

    public Funcionario(String nome, int idade, String sexo, double salarioAtual){
        this.nome = nome;
        this.idade= idade;
        this.sexo = sexo;
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

    public double calcularAbono(){
        if(sexo.equalsIgnoreCase("M") && idade >= 30){
            return 100.00;
        }else if(sexo.equalsIgnoreCase("M") && idade < 30){
            return 50.00;
        }else if(sexo.equalsIgnoreCase("F") && idade >= 30){
            return 200.00;
        }else if(sexo.equalsIgnoreCase("F") && idade < 30){
            return 80.00;
        }else{
            return 0;
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

    public void imprimirResultadoAbono(){
        System.out.println("Resultado:");
        System.out.println("Nome do funcionário(a): " + nome);
        System.out.println("Salário Líquido: R$" + (salarioAtual + calcularAbono()));
    }


    
}
