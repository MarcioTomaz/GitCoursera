package Carros;

public class Carro
{
    public int potencia;
    int velocidade;
    String nomeCarro;

    public void acelerar()
    {
        velocidade += potencia;
    }

    public void frear()
    {
        velocidade = velocidade / 2;
    }

    public int getVelocidade()
    {
        return velocidade;
    }

    void imprimir()
    {
        System.out.println("O carro "+nomeCarro+" está na velocidade "+getVelocidade()+" km/h");
    }
}