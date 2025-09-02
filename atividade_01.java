public class atividade_01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Gabriel", 20);
        Pessoa pessoa2 = new Pessoa("Lucas", 22);

        System.out.println("Pessoa 1: " + pessoa1.nome + ", " + pessoa1.idade);
        System.out.println("Pessoa 2: " + pessoa2.nome + ", " + pessoa2.idade);
    }
}

class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
