package carro;

public class carro {
    // atributos

    String nome;
    String marca;
    int ano;
    int vel;

    // metodos
    void acelerar(int acelecarao) {
        vel += acelecarao;

    }
    void freiar(int freio) {
        vel -= freio;
    }

    void buzinar() {
        System.out.println("BIBIBIBI");
    }

}
