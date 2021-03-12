package com.aula12;

public class Aula12 {
    public static void main(String[] args) {
        Aquatico aq1 = new Aquatico();
        Ave a1 = new Ave();
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Canguru k1 = new Canguru();
        Cachorro cao = new Cachorro();

        cao.emitirSom();

        k1.locomover();

        m1.setPeso(44.2);
        m1.setCorPelo("Marrom");
        m1.alimentar();
        m1.locomover();
        m1.emitirSom();

    }
}
