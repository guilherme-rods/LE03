package Classes;

public class Aluno {

    private String nome = new String();
    private double [] notas = new double[3];

    public Aluno(String nome, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
    }

    public double calculoMedia(){
        double media = (notas[0] + notas[1] + notas[2])/notas.length;
        return media;
    }

    public void imprimirResultado(){
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Média do Aluno: " + calculoMedia());
    }
}
