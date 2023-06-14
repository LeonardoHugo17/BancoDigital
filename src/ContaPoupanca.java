import java.text.DecimalFormat;

public class ContaPoupanca extends Conta {
    protected float SaldoConta;
    public boolean rendimentoContaPoupanca(){
        this.setSaldoContaPoupanca((float) (getSaldoContaPoupanca() + (getSaldoContaPoupanca() * 0.02)));
        return true;
    }

    public void depositoContaPoupanca(float valorDeposito) {
        this.setSaldoContaPoupanca(getSaldoContaPoupanca() + valorDeposito);
        rendimentoContaPoupanca();
    }

    public void saqueContaPoupanca(float valorSaque) {
        this.setSaldoContaPoupanca(getSaldoContaPoupanca() - valorSaque);
    }

    @Override
    public void ConsultaSaldo(){
        this.SaldoConta = getSaldoContaPoupanca();
        System.out.println("Saldo na Conta Poupança: R$ " + new DecimalFormat(".##").format(SaldoConta));
    }
}
