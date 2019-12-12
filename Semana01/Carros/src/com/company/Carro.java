package com.company;

public class Carro
{
    int potencia;
    int velocidade;
    String nomeCarro;

    void acelerar()
    {
        velocidade += potencia;
    }

    void frear()
    {
        velocidade = velocidade / 2;
    }

    int getVelocidade()
    {
        return velocidade;
    }

    void imprimir()
    {
        System.out.println("O carro "+nomeCarro+" está na velocidade "+getVelocidade()+" km/h");
    }
}
