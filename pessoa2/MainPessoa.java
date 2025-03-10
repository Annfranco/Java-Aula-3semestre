package pessoa2;

public class MainPessoa {
    
    public static void main(String[] args) {
        Fisica fisica = new Fisica("João", "1234-5678", "123.456.789-00", "12.345.678-9", "01/01/2000");
        Juridica juridica = new Juridica("Empresa", "9876-5432", "12.345.678/0001-90", "123.456.789.000");
        
        System.out.println(fisica);
        System.out.println(juridica);
    }
}
