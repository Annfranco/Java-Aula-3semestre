public abstract class Funcionario {
    protected String nome;
    protected String email;
    protected float salario;
    protected Endereco endereco;

    public Funcionario(String nome, String email, float salario, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.endereco = endereco;
    }


    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }

    public float getSalario() {
        return salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nEmail: " + email + "\nSalário: " + salario + "\nEndereço: " + endereco;
    }


}
