package Classes;

public class Pessoa {

    private String nome, sexo;
    private int idade;

    public Pessoa(int id){
        this.idade = id;
    }

    public Pessoa( String n){
        this.nome = n;
    }

    public void setSexo(String sex){
        this.sexo = sex;
    }

    public int getIdade(){
        return idade;
    }

}