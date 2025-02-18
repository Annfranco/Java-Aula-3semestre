public class OperadoresLogicos_Or {
    public static void main(String[] args) {
        // Declarando variaveis
        boolean temSol = true;
        boolean folga = false;

        // Só irá passear se uma das condições for verdadeira.
        if (temSol || folga) {
            System.out.println("Irei passear hoje! =D");
        } else {
            System.out.println("Não irei passear! =C");
        }
    }
}
