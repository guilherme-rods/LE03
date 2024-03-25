package Classes;

public class Compra {

    private float valor_compra;

    public Compra(float valor_compra){
        this.valor_compra = valor_compra;
    }

    public float calculoPrestacoes(){
        return valor_compra / 5;
    }

    public void imprimirResultado(){
        System.out.println("Valor de cada prestação: R$ " + calculoPrestacoes());
    }   
}