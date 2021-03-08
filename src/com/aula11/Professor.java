package com.aula11;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public void receberAumento() {
        System.out.println("Salario atual: " + this.getSalario());
        this.setSalario(this.getSalario() + 500.00);
        System.out.println("Salario após aumento: " + this.getSalario());
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
