package desconto;

public class DescontoNatal implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double valor) {
	// 25% de desconto
        return valor * 0.75; 
    }
}