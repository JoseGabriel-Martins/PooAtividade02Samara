public class atividade_04 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3500.0);
        Produto produto2 = new Produto("Mouse", 150.0);

        produto1.setPreco(-500.0); // teste de valor inválido
        produto2.setPreco(200.0);  // valor válido

        System.out.println(produto1.getNome() + " - R$" + produto1.getPreco());
        System.out.println(produto2.getNome() + " - R$" + produto2.getPreco());
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.setPreco(preco); // usa o setter para validar
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido: " + preco + ". Não pode ser negativo.");
        }
    }
}

