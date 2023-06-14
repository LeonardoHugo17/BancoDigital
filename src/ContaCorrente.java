import java.text.DecimalFormat;

public class ContaCorrente extends Conta {
    protected float SaldoConta;
    public void depositoContaCorrente(float valorDeposito){
       this.setSaldoContaCorrente(getSaldoContaCorrente() + valorDeposito);
    }

    public void saqueContaCorrente(float valorSaque){
        this.setSaldoContaCorrente(getSaldoContaCorrente() - valorSaque);
    }
    @Override
    public void ConsultaSaldo(){
        this.SaldoConta = getSaldoContaCorrente();
        System.out.println("Saldo na Conta Corrente: R$ " + new DecimalFormat(".##").format(SaldoConta));
    }
}