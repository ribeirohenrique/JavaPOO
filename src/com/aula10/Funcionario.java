package com.aula10;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho() {
        this.setTrabalhando(!this.isTrabalhando());
        if (this.isTrabalhando()) {
            System.out.println("Você está trabalhando :(");
        } else {
            System.out.println("Você não está trabalhando :)");
        }
    }

    //Getters and Setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
