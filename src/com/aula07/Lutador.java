package com.aula07;

public class Lutador implements ControladorLutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public void apresentar(){

        //Peso leve: < 65
        //Peso medio: >= 65 && < 90
        //Peso pesado: >= 90
        if (this.getPeso() < 65) {
            this.setCategoria("Peso Leve");
        } else if (this.getPeso() >= 65 && this.getPeso() < 90) {
            this.setCategoria("Peso Medio");
        } else {
            this.setCategoria("Peso Pesado");
        }

        System.out.println("------- APRESENTAÇÃO -------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias() + " | Derrotas: " + this.getDerrotas() + " | Empates: " + this.getEmpates());
        System.out.println();
    }

    @Override
    public void status(){
        System.out.println("------- STATUS -------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Vitórias: " + this.getVitorias() + " | Derrotas: " + this.getDerrotas() + " | Empates: " + this.getEmpates());
        System.out.println();
    }

    @Override
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
