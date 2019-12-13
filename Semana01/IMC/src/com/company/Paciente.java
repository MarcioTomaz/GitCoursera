package com.company;

public class Paciente
{
    double peso = 0 ;
    double altura = 0;

    Paciente(double peso, double altura)
    {
        this.peso = peso;
        this.altura = altura;
    }

   public double calcularIMC()
   {
       double IMC;
       IMC = peso/(altura*altura);
       return IMC;
   }


    public String diagnostico()
    {
        double resultado = calcularIMC();
        String teste;
        if(resultado < 16)
        {
            return "Baixo peso muito grave";
        }
        else if(resultado >= 16 && resultado <=16.99)
        {
            return "Baixo peso grave";
        }
        else if(resultado >=17 && resultado <=18.49)
        {
            return "Baixo peso";
        }
        else if(resultado >=18.50 && resultado <=24.99)
        {
            return "Peso normal";
        }
        else if(resultado >=25 && resultado <=29.99)
        {
            return "Sobrepeso";
        }
        else if(resultado >=30 && resultado <=34.99)
        {
            return "Obesidade grau 1";
        }
        else if(resultado >=35 && resultado <=39.99)
        {
            return "Obesidade grau 2";
        }
        else
        {
            return "Obesidade grau 3 (Obesidade mórbida";
        }

    }

}

