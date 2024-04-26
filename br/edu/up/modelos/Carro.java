package modelos;

public class Carro {

    private double custo;
    private double imposto = 0.45;
    private double distribuidor = 0.28;
    private int ano;
    private double valor;
    private String tipoCombustivel;

    public Carro(double custo){
        this.custo = custo;
    }

    public Carro(String tipoCombust, double valor){
        this.tipoCombustivel = tipoCombust;
        this.valor = valor;
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

    public double mostrarDesconto() {
        if (ano <= 2000) {
            return 0.12;
        } else if (ano > 2000) {
            return 0.07;
        }else{
            return 0;
        }
    }

    public double calcularDesconto() {
        if (tipoCombustivel.equalsIgnoreCase("alcool")){
            return valor * 0.25;
        } else if(tipoCombustivel.equalsIgnoreCase("gasolina")){
            return valor * 0.21;
        } else if(tipoCombustivel.equalsIgnoreCase("diesel")){
            return valor * 0.14;
        }else{
            return 0;
        }
    }


    public double calcularValorPago() {
        return valor - calcularDesconto();
    }

    public double calcularValorComDesconto() {
        return valor * (1 - mostrarDesconto());
    }


    public void imprimirResultado(){
        System.out.println("Custo consumidor final: R$ " + String.format("%.2f", calcularCustoConsumidor()));
    } 
}