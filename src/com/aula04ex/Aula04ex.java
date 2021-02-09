package com.aula04ex;

import java.util.Scanner;

public class Aula04ex {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o modelo: ");
        String modelo = teclado.nextLine();
        System.out.print("Qual a cor: ");
        String cor = teclado.nextLine();
        System.out.print("Qual o peso: ");
        int peso = teclado.nextInt();
        System.out.print("Qual o tamanho: ");
        int tamanho = teclado.nextInt();
        System.out.print("O pneu está furado? Sim/Não: ");
        boolean pneuFurado = teclado.nextBoolean();


        Bicicleta b1 = new Bicicleta(modelo, cor, peso, tamanho, pneuFurado);
        b1.status();

    }
}
