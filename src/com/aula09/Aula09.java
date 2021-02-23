package com.aula09;

public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Joana", 34, "F");

        l[0] = new Livro("Dom Quixote", "Miguel de Cervantes", 345, p[0]);
        l[1] = new Livro("Desenho Artistico", "Leonardo Davinci", 123, p[1]);
        l[2] = new Livro("A Cuca", "Monteiro Lobato", 452, p[1]);

        l[0].abrir();
        l[0].folhear();
        System.out.println(l[0].detalhes());

    }
}
