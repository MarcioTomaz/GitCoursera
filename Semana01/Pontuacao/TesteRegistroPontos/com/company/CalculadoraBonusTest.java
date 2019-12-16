package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraBonusTest {

    @Test
   public void pontosCriarTopico() {
        Usuario u = new Usuario();
        u.nome = "Marzio";
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos,5);
    }

    @Test
    public void pontosCriarTopicoVIP() {
        Usuario u = new Usuario();
        u.nome = "Marzio";
        u.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos,25);
    }
    @Test
    public void pontosCriarTopicoBonusDoDia() {
        Usuario u = new Usuario();
        u.nome = "Marzio";
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 3;
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos,15);
    }

    @Test
    public void pontosCriarTopicoBonusDoDiaVip() {
        Usuario u = new Usuario();
        u.nome = "Marzio";
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 2;
        u.vip = true;
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos,50);
    }
}