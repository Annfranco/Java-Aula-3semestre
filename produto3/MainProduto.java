package produto3;

public class MainProduto {
    public static void main(String[] args) {
        Camisa camisa = new Camisa("Adidas", "Roxo", "M", 199.99);
        Calca calca = new Calca("Michele", "Jeans Claro", "38", 99.99);
        Sapato sapato = new Sapato("Lacoste", "Verde", "42", 365);
        
        System.out.println(camisa.toString());
        System.out.println(calca.toString());
        System.out.println(sapato.toString());
        
    }
}
