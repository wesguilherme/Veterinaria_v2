package com.company.model;

import java.time.LocalDate;

public class Animais {

    private String numeroPaciente;
    private String especie;
    private String raca;
    private String cor;
    private LocalDate dataDeNascimento;
    private String nome;
    private Proprietario proprietario;

    public Animais(Long numeroPaciente) {
        this.numeroPaciente = String.valueOf(Long.MAX_VALUE);
    }

    public Animais(String especie, String raca, String cor, LocalDate dataDeNascimento, String nome, Proprietario proprietario) {
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        this.dataDeNascimento = dataDeNascimento;
        this.nome = nome;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Animais{" +
                "numeroPaciente='" + numeroPaciente + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", cor='" + cor + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", nome='" + nome + '\'' +
                ", proprietario=" + proprietario +
                '}';
    }
}
