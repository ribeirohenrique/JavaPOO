package com.aula06;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
//O Construtor nao tem parametro, comeca com as definicoes abaixo
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

//A partir daqui, foi implementado o codigo da Interface, onde esta a logica.

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Ligando a TV...");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Desligando a TV...");

    }

    @Override
    public void abrirMenu() {
        System.out.println("-------- MENU --------");
        String status;
        String tocando;
        if (this.isLigado()) {
            status = "Sim";
        } else {
            status = "Não";
        }
        if (this.isTocando()) {
            tocando = "Sim";
        } else {
            tocando = "Não";
        }
        System.out.println("Está ligado? - " + status);
        System.out.println("Está tocando? - " + tocando);
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print(" | ");
        }
        System.out.println();
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o menu...");

    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Não é possível aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossivel diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar");
        }
    }
}
