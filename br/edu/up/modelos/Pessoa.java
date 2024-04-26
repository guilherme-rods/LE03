package modelos;

public class Pessoa {

    private String nome, sexo;
    private double altura;
    private boolean saude;
    private int idade;
    private double pesoIdeal;
    private char grupoDeRisco;

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

    public Pessoa(String nome, int idade, char grupoDeRisco){
        this.nome = nome;
        this.idade = idade;
        this.grupoDeRisco = grupoDeRisco;
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

    public int definirCategoria(){
        if (idade < 17 || idade > 70) return -1;
        if (idade <= 20) return grupoDeRisco == 'B' ? 1 : grupoDeRisco == 'M' ? 2 : 3;
        if (idade <= 24) return grupoDeRisco == 'B' ? 2 : grupoDeRisco == 'M' ? 3 : 4;
        if (idade <= 34) return grupoDeRisco == 'B' ? 3 : grupoDeRisco == 'M' ? 4 : 5;
        if (idade <= 64) return grupoDeRisco == 'B' ? 4 : grupoDeRisco == 'M' ? 5 : 6;
        return grupoDeRisco == 'B' ? 7 : grupoDeRisco == 'M' ? 8 : 9;
    }

    public void imprimirCategoria() {
        int categoria = definirCategoria();
        if (categoria == -1) {
            System.out.println("Sinto muito Sr.(a) "+ nome + ", você não se enquadra em nenhuma das categorias ofertadas.");
        } else {
            System.out.println("O Sr.(a) " + nome + " é classificado(a) na categoria " + categoria + " do seguro.");
        }
    }
}