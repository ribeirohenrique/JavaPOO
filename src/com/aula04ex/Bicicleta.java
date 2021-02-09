package com.aula04ex;

public class Bicicleta {
    public String modelo;
    public String cor;
    private int peso;
    private double tamanho;
    private boolean pneuFurado;

    public Bicicleta(String modelo, String cor, int peso, double tamanho, boolean pneuFurado) {
        this.modelo = modelo;
        this.cor = cor;
        this.peso = peso;
        this.tamanho = tamanho;
        this.pneuFurado = pneuFurado;
    }


    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Peso: " + this.peso);
        System.out.println("Tamanho: " + this.tamanho);
        String condPneu;
        if (this.pneuFurado){
            condPneu = "Sim";
        } else {
            condPneu = "Não";
        }
        System.out.printf("Pneu furado: " + condPneu);

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isPneuFurado() {
        return pneuFurado;
    }

    public void setPneuFurado(boolean pneuFurado) {
        this.pneuFurado = pneuFurado;
    }
}
