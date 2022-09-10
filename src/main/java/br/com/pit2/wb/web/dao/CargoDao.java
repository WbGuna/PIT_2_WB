package br.com.pit2.wb.web.dao;

import java.util.List;

import br.com.pit2.wb.web.domain.Cargo;

public interface CargoDao {

    void save(Cargo cargo );

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
