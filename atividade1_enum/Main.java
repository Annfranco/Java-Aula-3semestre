package atividade1_enum;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("0041", 45, "Maria", 10000, Setor.RECURSOS_HUMANOS, Sexo.FEMININO);

        System.out.println(funcionario1.toString());
        
    }
}
