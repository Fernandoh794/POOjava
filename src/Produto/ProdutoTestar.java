package Produto;

public class ProdutoTestar {
    public static void main(String[] args) {
        // construtor Padrão;
        Produto p1 = new Produto();
        p1.nome = "Caneta Preta";
        p1.marca = "Bic";
        p1.valor = 1.74f;

        // construtor de dois paramentros
        Produto p2 = new Produto("Caneta vermelha", "faber");
        p2.valor = 1.75f;

        // construtor de três parametros

        Produto p3 = new Produto("Borracha", "faber", 1.74f);

        // objeto p1
        System.out.println("Nome: " + p1.nome + "Marca: " + p1.marca + "Valor: " + p1.valor) ;
        System.out.println("Nome: " + p2.nome + "Marca: " + p2.marca + "Valor: " + p2.valor) ;
        System.out.println("Nome: " + p3.nome + "Marca: " + p3.marca + "Valor: " + p3.valor) ;





    }
}
