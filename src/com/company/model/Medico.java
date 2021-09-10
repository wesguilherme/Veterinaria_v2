package com.company.model;

import java.text.ParseException;

public class Medico extends Pessoa{

    private Long numeroDeRegistro;
    private String especialidade;

    public Medico(String cpf, String nome, String sobrenome, Long numeroDeRegistro, String especialidade) throws ParseException {
        super(cpf, nome, sobrenome);
        this.numeroDeRegistro = numeroDeRegistro;
        this.especialidade = especialidade;
    }

    public Long getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(Long numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
