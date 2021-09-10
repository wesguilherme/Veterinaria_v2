package com.company;

import com.company.model.AnimaisDeFazenda;
import com.company.model.AnimaisDomesticos;
import com.company.model.Medico;
import com.company.model.Proprietario;

import java.text.ParseException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws ParseException {
//        Medico medico = new Medico("20747082030", "Etevaldo", "Lopes");
//        System.out.println(medico.getCpf());
        Proprietario proprietario = new Proprietario("20747082030", "Godofredo", "Peppa", LocalDate.of(1998,07,23),"Rua dos Bobos, 0","56634639");
        AnimaisDeFazenda animaisDeFazenda = new AnimaisDeFazenda("Cavalo","Quarto de Milha","Marrom",LocalDate.of(2020,7,10),"Josefa",proprietario);
        AnimaisDomesticos animaisDomesticos = new AnimaisDomesticos("Gato","Siames","Caramelo",LocalDate.of(2018,11,9),"kiko",proprietario);
        System.out.println(animaisDeFazenda);
    }
}
