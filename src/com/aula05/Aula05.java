package com.aula05;

import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
        Scanner dadosUsuario = new Scanner(System.in);
        System.out.print("Digite o numero da conta: ");
        int numConta = dadosUsuario.nextInt();
        System.out.print("Digite seu nome: ");
        String donoConta = dadosUsuario.next();
        ContaBanco c1 = new ContaBanco(numConta, donoConta);
        System.out.println();

        c1.menuSelecao();
    }
}
