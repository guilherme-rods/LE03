package modelos;

public class Vendedor {

    private String nome;
    private double salario_fixo;
    private double vendas;

    public Vendedor(String nome, double salario_fixo, double vendas){
        this.nome = nome;
        this.salario_fixo = salario_fixo;
        this.vendas = vendas;
    }

    public double calculoSalarioMensal(){
        double  salario_mes = salario_fixo + (vendas * 0.15);
        return salario_mes;
    }

    public void imprimirResultado(){
        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Salário Fixo: R$ " + salario_fixo);
        System.out.println("Salário do mês atual: R$ " + calculoSalarioMensal());

    }
}