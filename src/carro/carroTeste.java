package carro;

public class carroTeste {
    public static void main(String[] args) {
        carro c1 = new carro();
        c1.ano = 1997;
        c1.marca = "Fiat";
        c1.nome = "Uno";
        c1.vel = 70;

        c1.acelerar(10);
        c1.acelerar(30);
        c1.freiar(40);
        c1.buzinar();

        System.out.println("Sua velocidade é:" + c1.vel);
    }
}
