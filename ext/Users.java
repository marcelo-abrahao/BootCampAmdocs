package ext;
public class Users {
    private String nome;
    private int idade;
    private String cor;

    public Users (String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public Users (){}

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "User Dados: [cor=" + cor + ", idade=" + idade + ", nome=" + nome + "]";
    }  
    
    
}
