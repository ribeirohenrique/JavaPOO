package com.aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    //O método construtor é aquele que tem o mesmo nome da Classe, ele define uma "forma" pro objeto.
    public Caneta(String m, String c, float p){
        this.setModelo(m);
        this.setPonta(p);
        this.setCor(c);
        this.tampar();

    }

    public String getCor() {
        return cor;
    }
    public void setCor(String c) {
        this.cor = c;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo (String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }
    public void setPonta (float p){
        this.ponta = p;
    }

    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " +this.tampada);
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}
