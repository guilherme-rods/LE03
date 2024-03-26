package Classes;

public class Carro {

    private double custo;
    private double imposto = 0.45;
    private double distribuidor = 0.28;

    public Carro(double custo){
        this.custo = custo;
    }

    public double calcularCustoConsumidor(){
        return (custo * (1 + imposto)) * (1 + distribuidor);
    }

    public void imprimirResultado(){
        System.out.println("Custo consumidor final: R$ " + String.format("%.2f", calcularCustoConsumidor()));
    } 
}