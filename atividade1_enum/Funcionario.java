package atividade1_enum;

public class Funcionario {
    private String id;
    private String nome;
    private double salario;
    private int idade;
    private Sexo sexo;
    private Setor setor;

    public Funcionario() {
    }

    public Funcionario(String id, int idade, String nome, double salario, Setor setor, Sexo sexo) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + ", idade=" + idade + ", sexo="
                + sexo + ", setor=" + setor + "]";
    }

}
