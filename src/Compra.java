
import desconto.*;

public class Compra {
    private double valor;
    private DescontoStrategy desconto;

    public Compra(double valor, DescontoStrategy desconto) {
        this.valor = valor;
        this.desconto = desconto;
    }

    public void setDescontoStrategy(DescontoStrategy desconto) {
        this.desconto = desconto;
    }

    public double calcularValorComDesconto() {
        return desconto.aplicarDesconto(valor);
    }

    public double getValor() {
        return valor;
    }
}
