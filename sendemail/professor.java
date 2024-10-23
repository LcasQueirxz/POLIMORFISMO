package sendemail;

//criando a classe professor que extende a classe email
public class professor extends email {
    //construtor para inicializar o campo nome
    public professor(String nome) {
        super(nome);
    }

    //usamos override pra utilizar algo ja criado em outra classe
    @Override
    public String typeemail() {
        return "Ola Professor. " + nome + "!";
    }
}

