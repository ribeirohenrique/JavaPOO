package com.aula05;

import java.util.Scanner;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(int numConta, String dono) {
        //todo Fazer um gerador de numero de conta
        this.numConta = numConta;
        this.tipo = "";
        this.dono = dono;
        this.saldo = 0.00;
        this.status = false;
    }

    public void abrirConta(){
        Scanner tipoConta = new Scanner(System.in);
        System.out.print("Digite o tipo de conta que deseja abrir CP/CC: ");
        String tipo = tipoConta.next();
        if (tipo == "CP"){
            this.tipo = "CP";
            this.saldo += 150.00;
            System.out.println("Conta " + this.tipo + " aberta com sucesso! Saldo atual: " + this.saldo + " Reais.");
            this.status = true;
        }
        if (tipo == "CC"){
            this.tipo = "CC";
            this.saldo += 50.00;
            System.out.println("Conta " + this.tipo + " aberta com sucesso! Saldo atual: " + this.saldo + " Reais.");
            this.status = true;
        }
    }

    public void fecharConta(){
        if (this.saldo >= 0){
            System.out.println("Erro! Você não pode fechar esta conta, ainda há " + this.saldo + " Reais de saldo.");
            System.out.println("Você precisa sacar este valor antes de continuar o procedimento.");
            if (saldo < 0){
                System.out.println("Erro! Você não pode fechar esta conta, existe um saldo devedor de " + this.saldo + " Reais.");
                System.out.println("Você precisa quitar este valor antes de continuar o procedimento");
            }
        } else {
            this.status = false;
            System.out.println("Sua conta foi fechada com sucesso!");
        }
    }

    public void depositar(){
        if (this.status){
            Scanner deposito = new Scanner(System.in);
            System.out.print("Digite o valor que deseja depositar: ");
            double valorDeposito = deposito.nextDouble();
            this.saldo =+ valorDeposito;
            System.out.println("Valor depositado com sucesso, saldo atual: " + this.saldo + " Reais.");
        } else {
            System.out.println("Esta conta está fechada, para prosseguir é necessário reabrir.");
        }
    }

    public void sacar(){
        if (this.status){
            Scanner saca = new Scanner(System.in);
            System.out.print("Digite o valor que deseja sacar: ");
            double valorSaca = saca.nextDouble();
            saca.close();
            if (valorSaca > this.saldo){
                System.out.println("Erro, saldo insuficiente, tente outro valor");
            } else {
                this.saldo =- valorSaca;
                System.out.println("Valor sacado com sucesso, saldo atual: " + this.saldo + " Reais.");
            }
        } else {
            System.out.println("Esta conta está fechada, para prosseguir é necessário reabrir.");
        }
    }

    public void pagarMensal(){
        System.out.println("Cobrança mensal dos tributos da conta " + this.tipo + " número: " + this.numConta);
        if (this.tipo == "CC"){
            this.saldo -= 20.00;
            System.out.println("Valor descontado com sucesso, sado atual: " + this.saldo + " Reais.");
        }
        if (this.tipo == "CP"){
            this.saldo -= 12.00;
            System.out.println("Valor descontado com sucesso, sado atual: " + this.saldo + " Reais.");
        }
    }

    public void status(){
        System.out.println("Detalhes da conta");
        System.out.println("Numero da conta: " + this.numConta);
        System.out.println("Tipo de conta: " + this.tipo);
        System.out.println("Dono da conta: " + this.dono);
        System.out.println("Saldo atual: " + this.saldo);
        if (this.status){
            System.out.println("Status atual da conta: Aberta");
        } else {
            System.out.println("Status atual da conta: Fechada");
        }
    }

    public void menuSelecao (){
        Scanner selecao = new Scanner(System.in);
        while (true) {
            System.out.println("Menu de seleção");
            System.out.println("1 - Status da conta");
            System.out.println("2 - Abrir nova conta");
            System.out.println("3 - Fechar conta");
            System.out.println("4 - Depositar");
            System.out.println("5 - Sacar");
            System.out.println("6 - Pagar valor mensal obrigatório");
            System.out.print("O que deseja fazer: ");
            int status = selecao.nextInt();
            switch (status) {
                case 1:
                    status();
                    System.out.println();
                    break;
                case 2:
                    abrirConta();
                    System.out.println();
                    break;
                case 3:
                    fecharConta();
                    System.out.println();
                    break;
                case 4:
                    depositar();
                    System.out.println();
                    break;
                case 5:
                    sacar();
                    System.out.println();
                    break;
                case 6:
                    pagarMensal();
                    System.out.println();
                    break;
                }
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
