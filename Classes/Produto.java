package Classes;

public class Produto {

    private float custo;
    private float acrescimo;

    public Produto(float custo, float acrescimo){
        this.custo = custo;
        this.acrescimo = acrescimo;
    }

    public float calcularVenda(){
        return custo * (1 + (acrescimo/100));
    }

    public void imprimirResultado(){
        System.out.println("Valor de venda do produto: R$ " + String.format("%.2f", calcularVenda()));
    }
}