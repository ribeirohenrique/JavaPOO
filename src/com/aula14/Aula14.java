package com.aula14;

public class Aula14 {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Comidas brasileiras");
        v[1] = new Video("Consertando meu computador");
        v[2] = new Video("Garrafas termicas");

        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

        Gafanhoto[] g = new Gafanhoto[3];

        g[0] = new Gafanhoto("Pedrão", 22, "M", "Pepe");
        g[1] = new Gafanhoto("Ruth", 14, "F", "Rutinha");
        g[2] = new Gafanhoto("Samara", 35, "F", "Sasa");

        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println(g[2].toString());

        Visualizacao[] vi = new Visualizacao[3];
        //Aqui eu passei o gafanhoto e o video em array
        vi[0] = new Visualizacao(g[0], v[2]);
        vi[0].avaliar(10);
        vi[1] = new Visualizacao(g[0], v[1]);
        vi[0].avaliar();
        vi[2] = new Visualizacao(g[2], v[0]);
        vi[2].avaliar(35.0);

        System.out.println(vi[0].toString());

    }
}
