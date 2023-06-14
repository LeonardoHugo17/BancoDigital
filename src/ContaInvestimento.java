import java.text.DecimalFormat;

public class ContaInvestimento extends Conta {
    protected float SaldoConta;
    public boolean rendimentoContaInvestimento(){
        this.setSaldoContaInvestimento((float) (getSaldoContaInvestimento() + (getSaldoContaInvestimento() * 0.1)));
        return true;
    }

    public void depositoContaInvestimento(float valorDeposito){
       this.setSaldoContaInvestimento(getSaldoContaInvestimento() + valorDeposito);
       rendimentoContaInvestimento();
    }

    public void saqueContaInvestimento(float valorSaque){
        this.setSaldoContaInvestimento(getSaldoContaInvestimento() - valorSaque);
    }

    @Override
    public void ConsultaSaldo(){
        this.SaldoConta = getSaldoContaInvestimento();
        System.out.println("Saldo na Conta de Investimentos: " + new DecimalFormat(".##").format(SaldoConta));
    }

}
