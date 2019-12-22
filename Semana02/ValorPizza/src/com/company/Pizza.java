package com.company;
import java.util.HashMap;
import java.util.ArrayList;


public class Pizza {
   String nome;
   ArrayList<String> ingredientes = new ArrayList<String>();
   static HashMap<String, Integer> ingredientesContabilizados = new HashMap<String, Integer>();

    Pizza(String nomeDaPizza){
        this.nome = nomeDaPizza;
    }

    public void adicionaIngrediente(String ingredienteAdicionado) {
        ingredientes.add(ingredienteAdicionado);
        contabilizaIngrediente(ingredienteAdicionado);
    }
     static void contabilizaIngrediente(String chave){
         if(ingredientesContabilizados.containsKey(chave))
         {
             int valorAtual = ingredientesContabilizados.get(chave);
             ingredientesContabilizados.replace(chave, valorAtual+1);
         }
         else{
             ingredientesContabilizados.put(chave, 1);
         }

    }
    public int getPreco(){
        int totalIngrediente = ingredientes.size();
        if(totalIngrediente <= 2){
            return 15;
        }
        else if(totalIngrediente <=5){
            return 20;
        }
        else{
            return 23;
        }
    }
}
