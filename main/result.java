package main;
import sendemail.*;

//classe principal para executar o programa
public class result {
    
    public static void main(String[] args) {
        //criando instancias de professor e aluno com mensagens iniciais
        email professor = new professor("Bom dia, Murilo!");
        email aluno = new aluno("estou bem");

        //enviando emails com mensagens especificas
        professor.enviarEmail("bom dia, como vai?.");
        aluno.enviarEmail("passo bem, até breve!.");
    }
}

