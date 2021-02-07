package com.aula03;

public class Caneta {
    //Aqui eu defino todos os atributos que desejo extrair do objeto (molde) caneta
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    //Aqui eu defino todos os métodos que retornam ou nao algum resultado na tela, entenda como um processo
    public void status(){
        //a palavra "this" faz referência ao objeto na outra classe que o chamou, neste caso, o C1 (ver classe Aula02)
        System.out.print("A caneta " + this.cor);
        System.out.println(" está tampada? " + this.tampada);
        System.out.println("Sua ponta é " + this.ponta);
        System.out.println("Seu modelo é " + this.modelo);
        System.out.println("A carga está com " +this.carga);
    }

    public void rabiscar(){
        if (this.tampada){
            System.out.println("ERRO, não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }

    }

    public void tampar(){
        //Só quem pode mecher é a classe, ou seja, aqui ele pode ser alterado
        this.tampada = true;

    }

    public void destampar(){
        //Só quem pode mecher é a classe, ou seja, aqui ele pode ser alterado
        this.tampada = false;

    }
}
