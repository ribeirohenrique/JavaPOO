package com.aula11;

public class Aula11 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Pedro");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setCurso("Medicina");
        a1.setMatricula(1234);
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setIdade(25);
        b1.setSexo("M");
        b1.setMatricula(12345);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        System.out.println(b1.toString());

        Professor p1 = new Professor();
        p1.setNome("Professor Creisson");
        p1.setIdade(56);
        p1.setSexo("M");
        p1.setSalario(2500.00);
        p1.setEspecialidade("Doutorado em Plantas");
        p1.receberAumento();
        System.out.println(p1.toString());

        Tecnico t1 = new Tecnico();
        t1.setNome("Fernanda");
        t1.setIdade(34);
        t1.setSexo("F");
        t1.setMatricula(123456);
        t1.setRegistroProfissional(125523);
        t1.setCurso("Informatica");
        t1.praticar();
        t1.pagarMensalidade();
        System.out.println(t1.toString());

    }
}
