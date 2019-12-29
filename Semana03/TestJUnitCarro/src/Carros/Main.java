package Carros;

public class Main {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.potencia = 10;
        c1.nomeCarro = "Ferrari";
        c1.velocidade = 0;

        Carro c2 = new Carro();
        c2.potencia = 15;
        c2.nomeCarro = "Fiat da vivo";
        c2.velocidade = 0;

        Carro c3 = new Carro();
        c3.potencia = 10;
        c3.nomeCarro = "Ferrari";
        c3.velocidade = 0;

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();

        c2.acelerar();
        c2.acelerar();

        c1.imprimir();
        c2.imprimir();
        System.out.println("Imprimindo C3");
        c3.imprimir();
    }
}