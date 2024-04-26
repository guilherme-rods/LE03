package modelos;

public class Produto {

    private float custo;
    private float acrescimo;
    private float preco_venda;
    private String nome;

    public Produto(float custo, float acrescimo){
        this.custo = custo;
        this.acrescimo = acrescimo;
    }

    public Produto(String nome){
        this.nome = nome;
    }

    public Produto(float custo){
        this.custo = custo;
    }

    public float getCusto(){
        return custo;
    }

    public float getPrecoVenda(){
        return preco_venda;
    }

    public void setPrecoVenda(float preco_venda){
        this.preco_venda = preco_venda;
    }

    

    public float calcularVenda(){
        return custo * (1 + (acrescimo/100));
    }

    public void imprimirResultado(){
        System.out.println("Valor de venda do produto: R$ " + String.format("%.2f", calcularVenda()));
    }
}