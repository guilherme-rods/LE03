package Classes;

public class Carro {

    private double custo;
    private double imposto = 0.45;
    private double distribuidor = 0.28;
    private int ano;
    private double valor;

    public Carro(double custo){
        this.custo = custo;
    }

    public Carro(int an, double vlr){
        this.ano = an;
        this.valor = vlr;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public double calcularCustoConsumidor(){
        valor = (custo * (1 + imposto)) * (1 + distribuidor);
        return valor;
    }

    public double calcularDesconto() {
        if (ano <= 2000) {
            return 0.12;
        } else {
            return 0.07;
        }
    }

    public double calcularValorComDesconto() {
        return valor * (1 - calcularDesconto());
    }

    public void imprimirResultado(){
        System.out.println("Custo consumidor final: R$ " + String.format("%.2f", calcularCustoConsumidor()));
    } 
}