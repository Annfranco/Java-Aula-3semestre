package com.senai.aula_2.repository;

import com.senai.aula_2.model.Funcionario;
import com.senai.aula_2.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
