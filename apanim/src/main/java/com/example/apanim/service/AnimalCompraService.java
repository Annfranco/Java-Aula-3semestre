package com.example.apanim.service;

import com.example.apanim.DTO.AnimalCompraCadastroDTO;
import com.example.apanim.DTO.AnimalCompraResponseDTO;
import com.example.apanim.model.AnimalCompra;
import com.example.apanim.model.VendedorModel;
import com.example.apanim.repository.AnimalCompraRepository;
import com.example.apanim.repository.VendedorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnimalCompraService {

    private final AnimalCompraRepository animalCompraRepository;
    private final VendedorRepository vendedorRepository;

    public AnimalCompraService(AnimalCompraRepository animalCompraRepository,
                               VendedorRepository vendedorRepository) {
        this.animalCompraRepository = animalCompraRepository;
        this.vendedorRepository = vendedorRepository;
    }

    public AnimalCompra salvar(AnimalCompraCadastroDTO dto, Long vendedorId) {
        
        animalCompraRepository.findByNomeAndVendedorId(dto.getNome(), vendedorId)
            .ifPresent(u -> {
                throw new IllegalArgumentException("Você já cadastrou um animal à venda com este nome.");
            });

        VendedorModel dono = vendedorRepository.findById(vendedorId)
            .orElseThrow(() -> new IllegalArgumentException("Vendedor não encontrado."));

        AnimalCompra animal = new AnimalCompra();
        animal.setNome(dto.getNome());
        animal.setFaixaEtariaAnimal(dto.getFaixaEtariaAnimal());
        animal.setRaca(dto.getRaca());
        animal.setPorte(dto.getPorte());
        animal.setSexoAnimal(dto.getSexoAnimal());
        animal.setEspecie(dto.getEspecie());
        animal.setCondicaoEspecial(dto.getCondicaoEspecial());
        animal.setLogradouro(dto.getLogradouro());
        animal.setBairro(dto.getBairro());
        animal.setCor(dto.getCor());
        animal.setVacinado(dto.isVacinado());
        animal.setVermifugado(dto.isVermifugado());
        animal.setCastrado(dto.isCastrado());
        animal.setResumo(dto.getResumo());

        animal.setVendedor(dono);

        animal.setPedigree(dto.getPedigree());
        animal.setValorDoAnimal(dto.getValorDoAnimal());

        return animalCompraRepository.save(animal);
    }

    public List<AnimalCompraResponseDTO> listarTodos() {
        return animalCompraRepository.findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }

    private AnimalCompraResponseDTO toDTO(AnimalCompra compra) {
        Long vendedorId = (compra.getVendedor() != null) ? compra.getVendedor().getId() : null;

        Long usuarioIdBase = (compra.getUsuario() != null) ? compra.getUsuario().getId() : null;
        
        return new AnimalCompraResponseDTO(
            compra.getId(),
            compra.getNome(),
            compra.getFaixaEtariaAnimal(),
            compra.getRaca(),
            compra.getPorte(),
            compra.getSexoAnimal(),
            compra.getEspecie(),
            compra.getCondicaoEspecial(),
            compra.getLogradouro(),
            compra.getBairro(),
            compra.getCor(),
            compra.getVacinado(),
            compra.getVermifugado(),
            compra.getCastrado(),
            compra.getResumo(),
            vendedorId,
            compra.getPedigree(),
            compra.getValorDoAnimal()
        );
    }
    
   
    @Transactional
    public AnimalCompra atualizar(Long id, AnimalCompraCadastroDTO dto) {
        AnimalCompra animal = animalCompraRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Animal não encontrado."));

        if (!animal.getNome().equals(dto.getNome())) {
            animalCompraRepository.findByNomeAndVendedorId(dto.getNome(), dto.getVendedorId())
                .ifPresent(u -> {
                    throw new IllegalArgumentException("Você já cadastrou um animal com este novo nome.");
                });
        }

        if (!animal.getVendedor().getId().equals(dto.getVendedorId())) {
            VendedorModel novoDono = vendedorRepository.findById(dto.getVendedorId())
                    .orElseThrow(() -> new IllegalArgumentException("Novo usuário (dono) não encontrado."));
            animal.setVendedor(novoDono);
        }

        animal.setNome(dto.getNome());
        animal.setFaixaEtariaAnimal(dto.getFaixaEtariaAnimal());
        animal.setRaca(dto.getRaca());
        animal.setPorte(dto.getPorte());
        animal.setSexoAnimal(dto.getSexoAnimal());
        animal.setEspecie(dto.getEspecie());
        animal.setCondicaoEspecial(dto.getCondicaoEspecial());
        animal.setLogradouro(dto.getLogradouro());
        animal.setBairro(dto.getBairro());
        animal.setCor(dto.getCor());
        animal.setVacinado(dto.isVacinado());
        animal.setVermifugado(dto.isVermifugado());
        animal.setCastrado(dto.isCastrado());
        animal.setResumo(dto.getResumo());

        animal.setPedigree(dto.getPedigree());
        animal.setValorDoAnimal(dto.getValorDoAnimal());

        return animalCompraRepository.save(animal);
    }

    public void excluir(Long id) {
        AnimalCompra animal = animalCompraRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Animal não encontrado."));
        animalCompraRepository.delete(animal);
    }
}