package produto2;

public class MainProduto {
    public static void main(String[] args) {
        Processador processador1 = new Processador("Intel", "i7", "4.9G");
        Memoria memoria1 = new Memoria("Multilaser", "DDR3", "32GB", "1066 MHz");
        PlacaMae placaMae1 = new PlacaMae("ASUS", "a520m", "am4");
        DispositivorodutoArmazenamento dispositivorodutoArmazenamento1 = new DispositivorodutoArmazenamento("Adata", "hard disks", "32GB", "HDD");

        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
        System.out.println(placaMae1.toString());
        System.out.println(dispositivorodutoArmazenamento1.toString());
        
    }
}
