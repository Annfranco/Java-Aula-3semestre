package produto2;

public class DispositivorodutoArmazenamento extends Produto {
    private String capacidadeDeArmazenamento;
    private String tipoDeConexao;
    
    public DispositivorodutoArmazenamento(String marca, String modelo, String capacidadeDeArmazenamento,
            String tipoDeConexao) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    @Override
    public String toString() {
        return "DispositivorodutoArmazenamento [marca=" + marca + ", modelo=" + modelo + ", capacidadeDeArmazenamento="
                + capacidadeDeArmazenamento + ", tipoDeConexao=" + tipoDeConexao + "]";
    }

    
}
