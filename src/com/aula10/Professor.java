package com.aula10;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public void receberAumento(double valor) {
        this.setSalario(this.getSalario() + valor);
        System.out.println("Seu salário aumentou para: " + this.getSalario());
    }

    //Getters and Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
