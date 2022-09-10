package br.com.pit2.wb.web.dao;

import java.util.List;

import br.com.pit2.wb.web.domain.Departamento;

public interface DepartamentoDao {

    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
}
