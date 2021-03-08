package com.aula11;
//Aluno é uma especialização de Pessoa e Pessoa é uma generalização de Aluno
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void pagarMensalidade() {
        //Por estar como protected na classe Pessoa, é possivel acessar diretamente o atributo
        //Este método será sobreposto pelo Bolsista, pois sao duas mensalidades diferentes
        System.out.println("Pagando a mensalidade do Aluno " + this.nome);
    }

    //Getters and Setters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
