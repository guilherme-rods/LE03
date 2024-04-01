package Classes;

public class Pessoa {

    private String nome, sexo;
    private double altura;
    private boolean saude;
    private int idade;
    private double pesoIdeal;

    public Pessoa(int id){
        this.idade = id;
    }

    public Pessoa( String n){
        this.nome = n;
    }

    public Pessoa(String nome, String sexo, int idade, boolean saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public Pessoa(String nome, String sexo, double altura, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }

    public void setSexo(String sex){
        this.sexo = sex;
    }

    public void setIdade(int id){
        this.idade = id;
    }

    public void setSaude(boolean saude){
        this.saude = saude;
    }

    public int getIdade(){
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public boolean isSaude() {
        return saude;
    }

    public boolean aptoServicoMilitar() {
        return idade >= 18 && idade <= 25 && saude;
    }

    public void calcularPesoIdeal(){
        if(sexo.equalsIgnoreCase("M") && altura > 1.70 && idade <= 20){
            pesoIdeal =  (72.7 * altura) - 58;
        }else if(sexo.equalsIgnoreCase("M") && altura > 1.70 && idade <= 39){
            pesoIdeal =  (72.7 * altura) - 53;
        }else if(sexo.equalsIgnoreCase("M") && altura > 1.70 && idade >= 40){
            pesoIdeal =  (72.7 * altura) - 45;
        }else if(sexo.equalsIgnoreCase("M") && altura <= 1.70 && idade <= 40){
            pesoIdeal =  (72.7 * altura) - 50;
        }else if(sexo.equalsIgnoreCase("M") && altura <= 1.70 && idade > 40){
            pesoIdeal =  (72.7 * altura) - 58;
        }else if(sexo.equalsIgnoreCase("F") && altura > 1.50 && idade == 0){
            pesoIdeal =  (62.1 * altura) - 44.7;
        }else if(sexo.equalsIgnoreCase("F") && altura <= 1.50 && idade >= 35){
            pesoIdeal =  (62.1 * altura) - 45;
        }else if(sexo.equalsIgnoreCase("F") && altura <= 1.50 && idade < 35){
            pesoIdeal =  (62.1 * altura) - 49;
        }else{
            System.out.println("Dados inválidos!");
        }
    }

    public void imprimirResultado(){
        System.out.println("O peso ideal da pessoa é: " + pesoIdeal);
    }
}