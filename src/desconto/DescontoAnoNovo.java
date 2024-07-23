package desconto;

public class DescontoAnoNovo implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double valor) {
        //15% de desconto
	return valor * 0.85; 
    }
}
