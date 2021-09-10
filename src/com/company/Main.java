package com.company;

import com.company.DAO.MedicoDAO;
import com.company.model.AnimaisDeFazenda;
import com.company.model.AnimaisDomesticos;
import com.company.model.Medico;
import com.company.model.Proprietario;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        Medico medico = new Medico("20747082030", "Etevaldo", "Lopes", 5555555L, "neuro");
        MedicoDAO medicoDAO = new MedicoDAO();
        medicoDAO.cadastrar(medico);


        //Cria um Objeto JSON
        JSONObject jsonObject = new JSONObject();

        FileWriter writeFile = null;

        //Armazena dados em um Objeto JSON
        jsonObject.put("nome", "Allan");
        jsonObject.put("sobrenome", "Romanato");
        jsonObject.put("pais", "Brasil");
        jsonObject.put("estado", "SP");

        try {
            writeFile = new FileWriter("saida.json");
            //Escreve no arquivo conteudo do Objeto JSON
            writeFile.write(jsonObject.toJSONString());
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Imprimne na Tela o Objeto JSON para vizualização
        System.out.println(jsonObject);
//        System.out.println(medico.getCpf());
//        Proprietario proprietario = new Proprietario("20747082030", "Godofredo", "Peppa", LocalDate.of(1998,07,23),"Rua dos Bobos, 0","56634639");
//        AnimaisDeFazenda animaisDeFazenda = new AnimaisDeFazenda("Cavalo","Quarto de Milha","Marrom",LocalDate.of(2020,7,10),"Josefa",proprietario);
//        AnimaisDomesticos animaisDomesticos = new AnimaisDomesticos("Gato","Siames","Caramelo",LocalDate.of(2018,11,9),"kiko",proprietario);
//        System.out.println(animaisDeFazenda);
    }
}