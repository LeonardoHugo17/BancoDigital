
public class Conta {
    private String Nome;
    private int numeroConta;
    private int Agencia;
    private float SaldoContaCorrente;
    private float SaldoContaPoupanca;
    private float SaldoContaInvestimento;

    public void CriaConta(String Nome, int numeroConta, int Agencia){
        this.Nome = Nome;
        this.numeroConta = numeroConta;
        this.Agencia = Agencia;
        this.SaldoContaCorrente = 0;
        this.SaldoContaPoupanca = 0;
        this.SaldoContaInvestimento = 0;
    }


    public void setNome(String nome) {
        Nome = nome;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAgencia(int agencia) {
        Agencia = agencia;
    }

    public float setSaldoContaCorrente(float saldoContaCorrente) {
        SaldoContaCorrente = saldoContaCorrente;
        return saldoContaCorrente;
    }

    public void setSaldoContaPoupanca(float saldoContaPoupanca) {
        SaldoContaPoupanca = saldoContaPoupanca;
    }

    public void setSaldoContaInvestimento(float saldoContaInvestimento) {
        SaldoContaInvestimento = saldoContaInvestimento;
    }

    public String getNome() {
        return Nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return Agencia;
    }

    public float getSaldoContaCorrente() {
        if (SaldoContaCorrente == 0){
            return 0;
        } else {
            return SaldoContaCorrente;
        }

    }

    public float getSaldoContaPoupanca() {
        return SaldoContaPoupanca;
    }

    public float getSaldoContaInvestimento() {
        return SaldoContaInvestimento;
    }

    public void ConsultaSaldo(){
        System.out.println("Saldo na Conta Corrente: " + getSaldoContaCorrente());
    }

}
