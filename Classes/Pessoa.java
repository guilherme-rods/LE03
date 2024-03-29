package Classes;

public class Pessoa {

    private String nome, sexo;
    private boolean saude;
    private int idade;

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
}