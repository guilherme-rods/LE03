package modelos;

public class ContaDeLuz {

    private int tipoCliente;
    private double consumo;

    public ContaDeLuz(int tipoCliente, double consumo){
        this.tipoCliente = tipoCliente;
        this.consumo = consumo;
    }

    public double calcularValorLuz(){
        if(tipoCliente == 1){
            return consumo * 0.60;
        }else if(tipoCliente == 2){
            return consumo * 0.48;
        }else if(tipoCliente == 3){
            return consumo * 1.29;
        }else{
            return 0;
        }
    }

    public void imprimirResultado(){
        System.out.println("O valor da conta de luz é: R$" + calcularValorLuz());
    } 
}