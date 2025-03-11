package contratacao;

public abstract class Funcionario {
    protected String nome;
    protected String dataNascimento;
    protected Sexo sexo;
    protected Setor setor;
    protected double salarioBase;

    public Funcionario(String nome, String dataNascimento, Sexo sexo, Setor setor, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double getSalarioFinal();

    @Override
    public String toString() {
        return "Funcionário:\n" +
                "Nome: " + nome + "\n" +
                "Data de Nascimento: " + dataNascimento + "\n" +
                "Sexo: " + sexo + "\n" +
                "Setor: " + setor + "\n" +
                "Salário: " + salarioBase + "\n";
    }




}
