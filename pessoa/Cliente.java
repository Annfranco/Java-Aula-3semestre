package pessoa;

public class Cliente extends Pessoa {
    private String dataDePagamento;
    private String formaDePagamento;
    
    public Cliente(String nome, String idade, String dataDePagamento, String formaDePagamento) {
        super(nome, idade);
        this.dataDePagamento = dataDePagamento;
        this.formaDePagamento = formaDePagamento;
    }

    public String getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(String dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", dataDePagamento=" + dataDePagamento + ", idade=" + idade
                + ", formaDePagamento=" + formaDePagamento + "]";
    }
    
}
