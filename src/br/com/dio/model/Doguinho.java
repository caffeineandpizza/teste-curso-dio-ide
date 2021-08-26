package br.com.dio.model;

import java.util.Objects;

public class Doguinho {
    private String nome;
    private String cor;
    private Integer idade;

    public Doguinho() {}

    public Doguinho(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doguinho doguinho = (Doguinho) o;
        return Objects.equals(nome, doguinho.nome) && Objects.equals(cor, doguinho.cor) && Objects.equals(idade, doguinho.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Doguinho{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
