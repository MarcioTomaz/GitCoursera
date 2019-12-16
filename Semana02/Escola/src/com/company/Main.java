package com.company;

public class Main {

    public static void main(String[] args) {

        Aluno marzio = new Aluno();
        marzio.bim1 = 70;
        marzio.bim2 = 60;
        marzio.bim3 = 80;
        marzio.bim4 = 70;

        System.out.println("Média: "+marzio.media());
        System.out.println("Passou de ano? : "+marzio.passouDeAno());

    }
}
