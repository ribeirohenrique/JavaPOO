package com.aula07;

public class Aula07 {
    public static void main(String[] args) {
        Lutador lutador1 = new Lutador(
                "Pedro",
                "BR",
                22,
                1.67,
                100.4);

        lutador1.ganharLuta();
        lutador1.perderLuta();
        lutador1.apresentar();
        lutador1.status();
    }
}
