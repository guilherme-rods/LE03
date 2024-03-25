package Classes;

public class Conversao {

    private double cotacao;
    private double dolar;

    public Conversao(double cotacao, double dolar){
        this.cotacao = cotacao;
        this.dolar = dolar;
    }

    public double calcularCambio(){
        return dolar / cotacao;
    }

    public void imprimirResultado(){
        System.out.println("O valor disponível em reais é: R$ " + String.format("%.2f", calcularCambio()));
    }
}