package contratacao;

public class Motoboy extends Funcionario{
    private String carteiraDeHabilitacao;

    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salario, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salario);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Motoboy:\n" +
                "Nome: " + getNome() + "\n" +
                "Data de Nascimento: " + getDataNascimento() + "\n" +
                "Sexo: " + getSexo() + "\n" +
                "Setor: " + getSetor() + "\n" +
                "Salário: " + getSalarioBase() + "\n" +
                "Carteira de Habilitação: " + carteiraDeHabilitacao + "\n";
    }
}
