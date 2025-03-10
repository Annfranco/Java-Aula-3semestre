package produto;

public class MainProduto {
    public static void main(String[] args) {
        Processador processador1 = new Processador("Intel", "i7", "4.9G");
        Memoria memoria1 = new Memoria("Multilaser", "DDR3", "32GB");

        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
        
    }
}
