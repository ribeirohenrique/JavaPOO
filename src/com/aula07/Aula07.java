package com.aula07;

public class Aula07 {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[10];
        l[0] = new Lutador(
                "Pedro",
                "BR",
                22,
                1.67,
                60.4);

        l[1] = new Lutador(
                "Joaquim",
                "FR",
                24,
                1.98,
                90.4);

        l[3] = new Lutador(
                "Fernando",
                "US",
                34,
                1.56,
                100.0);

        l[4] = new Lutador(
                "Nicolas",
                "CN",
                55,
                1.89,
                52.7);

        Luta combate = new Luta();
        combate.marcarLuta(l[0], l[4]);
        combate.lutar();
        l[0].status();
        l[4].status();



    }
}
