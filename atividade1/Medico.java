public class Medico extends Funcionario {
    private String crm;

    public Medico(String nome, String email, float salario, Endereco endereco, String crm) {
        super(nome, email, salario, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCRM: " + crm;
    }
    
}
