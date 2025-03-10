public class MainFuncionario {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro("Fabio", "fabio@gmail.com", 100000, 
            new Endereco("Rua A", "5", "1 andar", "4168-978", "Saubara") , "123456");

        Medico medico = new Medico("João", "joao@gmail.com", 200000, 
            new Endereco("Rua B", "10", "2 andar", "4168-979", "Salvador") , "654321");

        System.out.println(engenheiro);
        System.out.println(medico);
    }
}