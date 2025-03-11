package contratacao;

public enum Sexo {
    MASCULINO ("Masculino"), 
    FEMININO ("Feminino");

    String texto;

    private Sexo (String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
