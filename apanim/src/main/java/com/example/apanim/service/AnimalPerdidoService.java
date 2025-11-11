package com.example.apanim.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.apanim.DTO.AnimalPerdidoCadastroDTO;
import com.example.apanim.DTO.AnimalPerdidoResponseDTO;
import com.example.apanim.model.AnimalPerdido;
import com.example.apanim.model.UsuarioModel;
import com.example.apanim.repository.AnimalPerdidoRepository;
import com.example.apanim.repository.AnimalAdocaoRepository;
import com.example.apanim.repository.UsuarioRepository;

import jakarta.transaction.Transactional;
import lombok.Getter;

@Getter
@Service
public class AnimalPerdidoService extends AnimalAdocaoService {
    private final AnimalPerdidoRepository animalPerdidoRepository;

    public AnimalPerdidoService(AnimalAdocaoRepository animalRepository, UsuarioRepository usuarioRepository,
            AnimalPerdidoRepository animalPerdidoRepository) {
        super(animalRepository, usuarioRepository);
        this.animalPerdidoRepository = animalPerdidoRepository;
    }

    @Transactional
    public AnimalPerdido salvarAnimalPerdido(AnimalPerdidoCadastroDTO dto, Long usuarioId) {
        animalPerdidoRepository.findByNomeAndUsuarioId(dto.getNome(), usuarioId)
            .ifPresent(u ->{
                throw new IllegalArgumentException("Você já cadastrou um animal com este nome.");
            });

        UsuarioModel dono = usuarioRepository.findById(usuarioId)
                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado."));
        
        AnimalPerdido animalPerdido = new AnimalPerdido();
        animalPerdido.setNome(dto.getNome());
        animalPerdido.setFaixaEtariaAnimal(dto.getFaixaEtariaAnimal());
        animalPerdido.setRaca(dto.getRaca());
        animalPerdido.setPorte(dto.getPorte());
        animalPerdido.setSexoAnimal(dto.getSexoAnimal());
        animalPerdido.setEspecie(dto.getEspecie());
        animalPerdido.setCondicaoEspecial(dto.getCondicaoEspecial());
        animalPerdido.setLogradouro(dto.getLogradouro());
        animalPerdido.setBairro(dto.getBairro());
        animalPerdido.setCor(dto.getCor());
        animalPerdido.setVacinado(dto.isVacinado());
        animalPerdido.setVermifugado(dto.isVermifugado());
        animalPerdido.setCastrado(dto.isCastrado());
        animalPerdido.setResumo(dto.getResumo());

        animalPerdido.setData(dto.getData());
        animalPerdido.setLocalDaUltimaAparicao(dto.getLocalDaUltimaAparicao());
        animalPerdido.setContato(dto.getContato());


        animalPerdido.setUsuario(dono);

        return animalPerdidoRepository.save(animalPerdido);
    }

    public List<AnimalPerdidoResponseDTO> listarAnimaisPerdidos() {
        return animalPerdidoRepository
                .findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }

    public AnimalPerdidoResponseDTO toDTO(AnimalPerdido animalPerdido) {
        return new AnimalPerdidoResponseDTO(
            animalPerdido.getId(),
            animalPerdido.getNome(), 
            animalPerdido.getFaixaEtariaAnimal(), 
            animalPerdido.getRaca(), 
            animalPerdido.getPorte(), 
            animalPerdido.getSexoAnimal(), 
            animalPerdido.getEspecie(), 
            animalPerdido.getCondicaoEspecial(),  
            animalPerdido.getLogradouro(), 
            animalPerdido.getBairro(), 
            animalPerdido.getCor(), 
            animalPerdido.getVacinado(), 
            animalPerdido.getVermifugado(), 
            animalPerdido.getCastrado(), 
            animalPerdido.getResumo(),
            animalPerdido.getUsuario().getId(), 
            animalPerdido.getData(), 
            animalPerdido.getLocalDaUltimaAparicao(),
            animalPerdido.getContato()
        );
    }

    @Transactional
    public AnimalPerdido atualizar(Long id, AnimalPerdidoCadastroDTO dto) {
        AnimalPerdido animalPerdido = animalPerdidoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Animal não encontrado."));

        if (!animalPerdido.getNome().equals(dto.getNome())) {
            animalPerdidoRepository.findByNomeAndUsuarioId(dto.getNome(), dto.getUsuarioId())
                .ifPresent(u -> {
                    throw new IllegalArgumentException("Você já cadastrou um animal com este novo nome.");
                });
        }

        animalPerdido.setNome(dto.getNome());
        animalPerdido.setFaixaEtariaAnimal(dto.getFaixaEtariaAnimal());
        animalPerdido.setRaca(dto.getRaca());
        animalPerdido.setPorte(dto.getPorte());
        animalPerdido.setSexoAnimal(dto.getSexoAnimal());
        animalPerdido.setEspecie(dto.getEspecie());
        animalPerdido.setCondicaoEspecial(dto.getCondicaoEspecial());
        animalPerdido.setLogradouro(dto.getLogradouro());
        animalPerdido.setBairro(dto.getBairro());
        animalPerdido.setCor(dto.getCor());
        animalPerdido.setVacinado(dto.isVacinado());
        animalPerdido.setVermifugado(dto.isVermifugado());
        animalPerdido.setCastrado(dto.isCastrado());
        animalPerdido.setResumo(dto.getResumo());

        animalPerdido.setData(dto.getData());
        animalPerdido.setLocalDaUltimaAparicao(dto.getLocalDaUltimaAparicao());
        animalPerdido.setContato(dto.getContato());

        return animalPerdidoRepository.save(animalPerdido);
    }

    public void excluir(Long id) {
        AnimalPerdido animalPerdido = animalPerdidoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Animal não encontrado."));
        animalPerdidoRepository.delete(animalPerdido);
    }
    
}
