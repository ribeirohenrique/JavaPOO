package com.aula14;
//Essa classe deve ser abstrata pq será somente a base para criar as outras
public abstract class Humano {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected double experiencia;

    public Humano(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    protected void ganharExp(int qtdExp) {
        System.out.println("Você ganhou" + qtdExp +" pontos de experiência!");
        this.setExperiencia(this.getExperiencia() + qtdExp);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Humano { " +
                "nome = '" + nome + '\'' +
                ", idade = " + idade +
                ", sexo = '" + sexo + '\'' +
                ", experiencia = " + experiencia +
                '}';
    }
}
