package desafio1;

public class IdadePessoa {

    private String nome;
    private int idade;

    // Construtor

    public IdadePessoa(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    void verificaIdade()
    {
        if (this.idade >= 18) {
            System.out.println("Idade maior que 18");
        }
           else if (this.idade < 18) {
                System.out.println("Idade menor que 18");
            }
      }
}