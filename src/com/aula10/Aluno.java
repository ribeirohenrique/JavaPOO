package com.aula10;

public class Aluno extends Pessoa {
    private boolean matricula;
    private String curso;

    public void cancelarMatricula() {
        this.setMatricula(!this.isMatricula());
        System.out.println("Matricula cancelada com sucesso!");
    }

    //Getters and Setters
    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
