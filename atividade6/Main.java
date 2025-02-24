package atividade6;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Mara", 54, 
            new Endereco("Rua A", "6", "Saubara"));

        System.out.println(cliente.toString());
    }
}
