package com.company;

public class Main {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("4 queijos");
        Pizza pizza2 = new Pizza("Frango com catupiry");
        Pizza pizza3 = new Pizza("Calabresa com mussarela");

        pizza1.adicionaIngrediente("Mussarela");
        pizza1.adicionaIngrediente("Parmesão");
        pizza1.adicionaIngrediente("Provolone");
        pizza1.adicionaIngrediente("Cheddar");
        pizza1.adicionaIngrediente("Azeitona");
        pizza1.adicionaIngrediente("Orégano");


        pizza2.adicionaIngrediente("Frango");
        pizza2.adicionaIngrediente("Catupiry");

        pizza3.adicionaIngrediente("Calabresa");
        pizza3.adicionaIngrediente("Mussarela");
        pizza3.adicionaIngrediente("Azeitona");

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarAoCarrinho(pizza1);
        carrinhoDeCompras.adicionarAoCarrinho(pizza2);
        carrinhoDeCompras.adicionarAoCarrinho(pizza3);

        System.out.println("O valor total das 3 pizzas é: " + "R$ " + carrinhoDeCompras.calcularValorTotal());

        for (String i : Pizza.ingredientesContabilizados.keySet()) {
            System.out.println("\nIngrediente: " + i + "\nQuantidade: " + Pizza.ingredientesContabilizados.get(i) + "\n");
        }
    }
}
