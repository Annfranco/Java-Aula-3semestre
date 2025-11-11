package com.example.apanim.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // 1. Desabilita o CSRF, pois estamos criando uma API REST
            .csrf(csrf -> csrf.disable())
            
            // 2. Torna a sessão "stateless" (não guarda estado), padrão para APIs REST
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            
            // 3. Define as regras de autorização
            .authorizeHttpRequests(authorize -> authorize
                
                // LIBERA AS ROTAS DE CADASTRO/LISTAGEM/CRUD (POST, GET, PUT, DELETE)
                .requestMatchers(
                    "/animais/**", 
                    "/animalPerdido/**",        // Singular (do seu Controller)
                    "/animais-perdidos/**",     // Plural (para robustez)
                    "/usuarios/**", 
                    "/animalCompra/**", 
                    "/vendedor/**",
                    "/h2-console/**"            // H2 Console também liberado aqui
                ).permitAll()
                
                // Para qualquer OUTRA requisição, exige autenticação
                .anyRequest().authenticated()
            );

        // Permite que o H2 Console seja exibido em frames
        http.headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable()));

        return http.build();
    }
}