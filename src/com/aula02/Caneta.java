package com.aula02;

public class Caneta {
    //Aqui eu defino todos os atributos que desejo extrair do objeto (molde) caneta
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //Aqui eu defino todos os métodos que retornam ou nao algum resultado na tela, entenda como um processo
    void status(){
        //a palavra "this" faz referência ao objeto na outra classe que o chamou, neste caso, o C1 (ver classe Aula02)
        System.out.print("A caneta " + this.cor);
        System.out.println(" está tampada? " + this.tampada);
        System.out.println("Sua ponta é " + this.ponta);
        System.out.println("Seu modelo é " + this.modelo);
        System.out.println("A carga está com " +this.carga);
    }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO, não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }

    }

    void tampar(){
        this.tampada = true;

    }

    void destampar(){
        this.tampada = false;

    }
}
