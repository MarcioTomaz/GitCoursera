package com.company;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    ArrayList<Pizza> pizzas=new ArrayList();

    public void adicionarAoCarrinho(Pizza pizza){
        if(pizza.ingredientes.size() < 1){
            System.out.println("Pizza inválida. É necessário ao menos um ingrediente na pizza! >:( ");
        } else {
            pizzas.add(pizza);
        }

    }
    public int calcularValorTotal(){
        int valorTotal = 0;
        for(Pizza i: pizzas){
            valorTotal += i.getPreco();
        }
        return valorTotal;
    }

    public void todosIngredientes(){
        Pizza.ingredientesContabilizados.keySet();
    }
}

