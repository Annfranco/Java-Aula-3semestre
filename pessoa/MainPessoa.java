package pessoa;

public class MainPessoa {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana", "23", "18-03-2025", "Debito");
        Funcionario funcionario1 = new Funcionario("Marcela","56", "41009", "Administrador", "20.000");
        
        System.out.println(cliente1.toString());
        System.out.println(funcionario1.toString());
    }
}
