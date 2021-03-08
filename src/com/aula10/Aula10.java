package com.aula10;

public class Aula10 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p1.setSexo("M");
        p1.setIdade(23);
        System.out.println(p1.toString());

        p2.setNome("Juliana");
        p2.setSexo("F");
        p2.setIdade(67);
        p2.setCurso("Literatura");
        System.out.println(p2.toString());

        p3.setNome("Hugo");
        p3.setSexo("M");
        p3.setIdade(45);
        p3.setSalario(2457.23);
        System.out.println(p3.toString());

        p4.setNome("Victoria");
        p4.setSexo("F");
        p4.setIdade(57);
        p4.setTrabalhando(false);
        p4.mudarTrabalho();
        System.out.println(p4.toString());



    }
}
