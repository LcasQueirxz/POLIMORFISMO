package sendemail;

//mostrando minha classe e oq eu qro para essas linhas de cod, e identificando do q ela precisa, se um private ou protected, depende das funcoes q eu qro
public abstract class email {
    protected String nome; //campo para armazenar o nome, pode ser usado por subclasses

    //construtor para inicializar o campo nome
    public email(String nome) {
        this.nome = nome;
    }

    //metodo abstrato que deve ser implementado pelas subclasses para definir o tipo de email
    public abstract String typeemail();

    //metodo para criar e enviar um email, combinando o tipo de email com a mensagem
    public void enviarEmail(String mensagem) {
        String email = typeemail() + "\n\n" + mensagem;
        System.out.println(email);
    }
}
