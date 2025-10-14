package br.com.example.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.example.api.model.Pessoa;

public interface Repository extends CrudRepository<Pessoa, Integer> {
    
    List<Pessoa> findAll();
    Pessoa findByCodigo(int codigo);
    
}
