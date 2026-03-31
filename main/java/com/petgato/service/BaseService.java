package com.projeto.service;

import java.util.List;
import java.util.Optional;

public interface BaseService<T, ID> {

    List<T> listar();

    Optional<T> buscarPorId(ID id);

    T salvar(T entity);

    void deletar(ID id);
}
