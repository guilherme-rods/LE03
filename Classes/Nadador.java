package Classes;

public class Nadador {

    private int idade;

    public Nadador(int idade){
        this.idade = idade;
    }

    public String classificarNadador(){
        if(idade < 5){
            return "Idade fora da faixa etária!";
        }else if(5 <= idade && idade <= 7){
            return "Infantil A!";
        }else if(idade <= 10){
            return "Infantil B!";
        }else if(idade <= 13){
            return "Juvenil A!";
        }else if(idade <= 17){
            return "Juvenil B!";
        }else if(idade <= 25){
            return "Sênior!";
        }else{
            return "Idade fora da faixa etária!";
        }
    }    
}