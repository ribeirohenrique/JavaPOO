package com.aula03;

public class Aula03 {
    public static void main(String[] args) {
        //Exemplo do caixa de supermercado
        //eu só posso dar o dinheiro pra pessoa e depois ela vai e dá o troco
        //Logo, o acesso ao caixa é privado, mas a pessoa não
        Caneta c1 = new Caneta();
        c1.modelo = "Caran d'Ache";
        c1.cor = "Ciano";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.status();
        c1.rabiscar();
        c1.destampar();
    }
}
