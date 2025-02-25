package produto2;

public class Memoria extends Produto {
    private String capacidadeDeArmazenamento;
    private String frenquencia;
    
    public Memoria(String marca, String modelo, String capacidadeDeArmazenamento, String frenquencia) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
        this.frenquencia = frenquencia;
    }

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getFrenquencia() {
        return frenquencia;
    }

    public void setFrenquencia(String frenquencia) {
        this.frenquencia = frenquencia;
    }

    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento + ", modelo="
                + modelo + ", frenquencia=" + frenquencia + "]";
    }


}

