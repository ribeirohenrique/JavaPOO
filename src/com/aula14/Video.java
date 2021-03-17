package com.aula14;

public class Video implements AcoesVideo {
    private String titulo;
    private double avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        if (this.isReproduzindo()) {
            System.out.println("Erro, o vídeo já está em reprodução.");
        } else {
            System.out.println("Reproduzindo o vídeo.");
            this.setReproduzindo(true);
        }
    }

    @Override
    public void pause() {
        if (!this.isReproduzindo()) {
            System.out.println("Erro, o vídeo já está pausado");
        } else {
            System.out.println("Vídeo Pausado.");
            this.setReproduzindo(false);
        }
    }

    @Override
    public void like() {
        System.out.println("Vídeo marcado como Gostei!");
        this.setCurtidas(this.getCurtidas() + 1);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        //Considera a média de acordo com a qtd de visualizacoes
        int nova;
        nova = (int) ((this.getAvaliacao() + avaliacao)/this.getViews());
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video { " +
                "titulo = '" + titulo + '\'' +
                ", avaliacao = " + avaliacao +
                ", views = " + views +
                ", curtidas = " + curtidas +
                ", reproduzindo = " + reproduzindo +
                '}';
    }
}
