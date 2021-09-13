package com.company.model;

import java.util.List;

public interface DAO<T> {
    String cadastrar(T obj);

    List<Object> listar(T obj);
}
