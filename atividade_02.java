public class atividade_02 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", 2020);

        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Ano: " + carro1.getAno());
    }
}

class Carro {
    private String marca;
    private int ano;

    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }
}
