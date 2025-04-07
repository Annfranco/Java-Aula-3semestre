package com.senai.atividade.api_rest.service;

import com.senai.atividade.api_rest.exception.EmailJaCadastradoException;
import com.senai.atividade.api_rest.model.Funcionario;
import com.senai.atividade.api_rest.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class FuncionarioService {
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> listarTodos() {
        return funcionarioRepository.findAll();
    }

    public Funcionario salvar(@Valid Funcionario funcionario) {
        if(funcionarioRepository.findByEmail(funcionario.getEmail()).isPresent()) {
            throw new EmailJaCadastradoException("Funcionario já cadastrado.");
        }
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario atualizar(@Valid Funcionario funcionario) {
        Funcionario funcionarioAtualizar = funcionarioRepository.findById(funcionario.getId())
                    .orElseThrow(() -> new IllegalArgumentException(("Funcionario não encontrado.")));

        funcionarioAtualizar.setNome(funcionario.getNome());
        funcionarioAtualizar.setEmail(funcionario.getEmail());
        funcionarioAtualizar.setSalario(funcionario.getSalario());
        funcionarioAtualizar.setSexo(funcionario.getSexo());
        funcionarioAtualizar.setEndereco(funcionario.getEndereco());

        return funcionarioRepository.save(funcionarioAtualizar);
    }

    public void excluir(Long id) {
        Funcionario funcionarioExcluir = funcionarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Funcionario não encontrado."));

        funcionarioRepository.delete(funcionarioExcluir);
    }

}
