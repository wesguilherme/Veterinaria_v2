package com.company;

import com.company.DAO.MedicoDAO;
import com.company.model.AnimaisDeFazenda;
import com.company.model.AnimaisDomesticos;
import com.company.model.Medico;
import com.company.model.Proprietario;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        List<Medico> medicos = new ArrayList<>();
        Medico medico1 = new Medico("20747082030", "Etevaldo", "Lopes", 5555555L, "neuro");
        Medico medico2 = new Medico("20747082030", "Rafael", "Teste", 5555555L, "neuro");

        medicos.add(medico1);
        medicos.add(medico2);

        MedicoDAO medicoDAO = new MedicoDAO();
        System.out.println(medicoDAO.cadastrar(medicos));

//        JSONObject jsonObject;
//        //Cria o parse de tratamento
//        JSONParser parser = new JSONParser();
//        //Variaveis que irao armazenar os dados do arquivo JSON
//        String nome;
//        String sobrenome;
//
//        try {
//            //Salva no objeto JSONObject o que o parse tratou do arquivo
//            jsonObject = (JSONObject) parser.parse(new FileReader("saida.json"));
//
//            //Salva nas variaveis os dados retirados do arquivo
//            nome = (String) jsonObject
//
//            System.out.printf(nome);
//        }
//        //Trata as exceptions que podem ser lançadas no decorrer do processo
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (org.json.simple.parser.ParseException e) {
//            e.printStackTrace();
//        }
    }

//        System.out.println(medico.getCpf());
//        Proprietario proprietario = new Proprietario("20747082030", "Godofredo", "Peppa", LocalDate.of(1998,07,23),"Rua dos Bobos, 0","56634639");
//        AnimaisDeFazenda animaisDeFazenda = new AnimaisDeFazenda("Cavalo","Quarto de Milha","Marrom",LocalDate.of(2020,7,10),"Josefa",proprietario);
//        AnimaisDomesticos animaisDomesticos = new AnimaisDomesticos("Gato","Siames","Caramelo",LocalDate.of(2018,11,9),"kiko",proprietario);
//        System.out.println(animaisDeFazenda);
}
