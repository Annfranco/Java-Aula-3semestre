package contratacao;

public class Diretor extends Funcionario implements Contratacao {
    public final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase + salarioBase * PREMIO;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Diretor admitindo funcionário: " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Diretor demitindo funcionário: " + funcionario.getNome());
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
            "Salario Final: " + getSalarioFinal();
    }
            
}
