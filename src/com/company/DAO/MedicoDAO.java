package com.company.DAO;

import com.company.model.DAO;
import com.company.model.Medico;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MedicoDAO implements DAO<Medico> {

    @Override
    public String cadastrar(List<Medico> medicos) {

        JSONObject jsonObject = new JSONObject();

        FileWriter writeFile = null;

        jsonObject.put("Medico", medicos);

        try {
            writeFile = new FileWriter("saida.json");
            writeFile.write(jsonObject.toJSONString());
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonObject.toJSONString();
    }

    @Override
    public List<Object> listar(Medico obj) {
        return null;
    }
}