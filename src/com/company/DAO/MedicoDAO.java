package com.company.DAO;

import com.company.model.DAO;
import com.company.model.Medico;

public class MedicoDAO implements DAO<Medico> {

    @Override
    public void cadastrar(Medico obj) {
        System.out.println(obj.getCpf());
    }
}
