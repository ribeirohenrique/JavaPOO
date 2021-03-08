package com.aula11;
//O Tecnico herdou de Aluno que herda de Pessoa, logo tem os atributos de seus ancestrais
public class Tecnico extends Aluno {
    private int registroProfissional;

    public void praticar() {
        //Por estar como protected na classe Pessoa, é possivel acessar diretamente o atributo
        System.out.println("O técnico " + this.nome + " está Praticando.");
    }

    //Getters and Setters
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
