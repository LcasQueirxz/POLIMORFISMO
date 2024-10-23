package sendemail;

//aqui nos criamos o metodo e importamos um determinado valor de uma superclasse
public class aluno extends email {
    //aqui n sei mto bem oq esta fazendo, ai vc me diz oqe
    public aluno(String nome) {
        super(nome);
    }
    //usamos override pra utilizar algo ja criado em outra classe
    @Override
    public String typeemail() {
        return "eae aluno " + nome;
    }
}
