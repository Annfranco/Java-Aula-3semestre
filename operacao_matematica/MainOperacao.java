public class MainOperacao {
    public static void main(String[] args) {
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica subtracao = new Subtracao();
        OperacaoMatematica multiplicacao = new Multiplicacao();
        OperacaoMatematica divisao = new Divisao();
        
        System.out.println("Soma: " + soma.calcular(10, 5));
        System.out.println("Subtração: " + subtracao.calcular(10, 5));
        System.out.println("Multiplicação: " + multiplicacao.calcular(10, 5));
        System.out.println("Divisão: " + divisao.calcular(10, 5));
    }
}
