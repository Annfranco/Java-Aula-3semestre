package com.senai.aula_1.service;

import com.senai.aula_1.model.Funcionario;
import com.senai.aula_1.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public Funcionario salvarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario listarTodos() {
        return funcionarioRepository.findAll(funcionario);
    }
    public Funcionario buscarFuncionarioPorId(Long id) {
        return funcionarioRepository.findById(id).orElse(null);
    }
}
