package com.example;

public class MainCliente {
    public static void main(String[] args) {
        // instaciando classe - criando objeto
        Cliente cliente1 = new Cliente();

        cliente1.setNome("Marta");
        cliente1.setEmail("Marta@gmail.com");
        cliente1.setSenha(123);
        
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Senha: " + cliente1.getSenha());
        
        // Cliente 2.
        Cliente cliente2 = new Cliente("Julia", "juju@email.com", 254);
        System.out.println(cliente2.toString());
        
    }
}