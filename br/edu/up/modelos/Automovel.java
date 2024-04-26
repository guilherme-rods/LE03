package modelos;

public class Automovel {

    private double distancia;
    private double combustivel_gasto;

    public Automovel(double distancia, double combustivel_gasto){
        this.distancia = distancia;
        this.combustivel_gasto = combustivel_gasto;
    }

    public double calculoConsumo(){
        return distancia / combustivel_gasto;
    }

    public void imprimirResultado(){
        System.out.println("O consumo médio do automóvel é: " + calculoConsumo() + " Km/L.");
    }
    
}
