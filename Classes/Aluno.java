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

    public Aluno(double nota1, double nota2, double nota3){
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
    }

    public double calculoMedia(){
        double media = (notas[0] + notas[1] + notas[2])/notas.length;
        return media;
    }

    public double calculoMediaPonderada(){
        return ((notas[0]*2) + (notas[1]*3) + (notas[2]*5))/(2+3+5);
    }

    public void imprimirAprovacao(){
        if(calculoMedia() >= 7){
            System.out.println("Aluno: " + nome + " - Aprovado");
        }else if(calculoMedia() <= 5){
            System.out.println("Aluno: " + nome + " - Reprovado");
        }else{
            System.out.println("Aluno: " + nome + " - Recuperação");
        }
    }

    public void imprimirResultado(){
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Média do Aluno: " + calculoMedia());
    }

    public void imprimirMediaPonderada(){
        System.out.println("Nota final do Aluno: " + calculoMediaPonderada());
    }
}
