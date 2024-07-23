import desconto.DescontoAnoNovo;
import desconto.DescontoNatal;
import desconto.DescontoBlackFriday;

public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra(100.0, new DescontoNatal());
        System.out.println("Valor do produto R$ "+ compra.getValor());
        System.out.println("Valor com desconto de Natal R$ " + compra.calcularValorComDesconto());

        compra.setDescontoStrategy(new DescontoAnoNovo());
        System.out.println("Valor com desconto de Ano Novo R$ " + compra.calcularValorComDesconto());

        compra.setDescontoStrategy(new DescontoBlackFriday());
        System.out.println("Valor com desconto de Black Friday R$ " + compra.calcularValorComDesconto());
    }
}
