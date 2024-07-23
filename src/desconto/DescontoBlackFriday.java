package desconto;

public class DescontoBlackFriday implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double valor) {

	// 50% de desconto
	return valor * 0.5; // Sem desconto
    }
}