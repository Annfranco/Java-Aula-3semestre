package com.example.aula.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UsuarioDTO {
    @NotBlank(message = "E-mail é obrigatório.")
    @Email(message = "Deve ser um email válido.")
    private String email;

    @NotBlank(message = "Senha é obrigatória.")
    private String senha;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public @NotBlank(message = "Senha é obrigatória.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Senha é obrigatória.") String senha) {
        this.senha = senha;
    }

    public @NotBlank(message = "E-mail é obrigatório.") @Email(message = "Deve ser um email válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "E-mail é obrigatório.") @Email(message = "Deve ser um email válido.") String email) {
        this.email = email;
    }
}
