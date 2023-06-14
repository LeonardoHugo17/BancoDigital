import java.text.DecimalFormat;

public class Cambio {
    protected float valorTransacao;
    protected float valorDolar;
    protected float tarifa;
    protected float totalCambio;

    //TAXA DA CASA DE CAMBIO PARA A COMPRA DO DOLAR: 3%
    public void compraDolar(ContaCorrente contaCorrente, float valorDolar, float valorTransferencia){
        this.valorTransacao = valorTransferencia;
        this.valorDolar = valorDolar;
        this.tarifa = (float) (valorTransacao * 0.03);
        this.totalCambio = valorTransacao - tarifa;
        contaCorrente.saqueContaCorrente(valorTransferencia);
    }

    public void comprovanteCompraDolar(){
        System.out.println("\n" + "\n" + "======TRANSFERÊNCIA DE ENVIO INTERNACIONAL======" + "\n" +
                "TARIFA: R$ " + new DecimalFormat(".##").format(tarifa) + "\n" +
                "VALOR DA TRANSAÇÃO: R$ " + new DecimalFormat(".##").format(valorTransacao) + "\n" +
                "TOTAL DE DOLARES RECEBIDOS: U$ " + new DecimalFormat(".##").format(totalCambio / valorDolar));
    }
}
