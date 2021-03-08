package com.aula11;
//Bolsista é uma especialização de Aluno e Aluno é uma generalização de Bolsista
public class Bolsista extends Aluno {
    private double bolsa;

    public void renovarBolsa() {
        //Por estar como protected na classe Pessoa, é possivel acessar diretamente o atributo
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    //Este método sobrepoe o do Aluno, pois sao duas mensalidades diferentes
    public void pagarMensalidade() {
        System.out.println(this.nome + " É bolsista.");
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
