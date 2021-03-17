package com.aula14;

public class Gafanhoto extends Humano {
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm() {
        System.out.println("Parabéns, você concluiu mais um vídeo e ganhou +10 pontos!");
        this.setTotAssistido(this.getTotAssistido() + 1);
        this.setExperiencia(this.getExperiencia() + 10);
        System.out.println("seu total agora é: " + this.getTotAssistido() +" Vídeos assistidos e " + this.getExperiencia() + " Pontos obtidos.");
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto { " + super.toString() +
                ", login = '" + login + '\'' +
                ", totAssistido = " + totAssistido +
                '}';
    }
}
