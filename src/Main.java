import com.sun.org.apache.regexp.internal.RE;

public class Main {
    public static void main(String[] args) {
        Conta cn = new Conta();
        ContaCorrente ct = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        ContaInvestimento ci = new ContaInvestimento();
        Recarga rg = new Recarga();
        Cambio cb = new Cambio();

        cn.CriaConta("Mateus Santos", 12345, 1234);

        ct.depositoContaCorrente(1000);

        cp.depositoContaPoupanca(1500);

        ci.depositoContaInvestimento(10000);

        rg.realizarRecarga(ct, "(11) 40028922", 20);

        cb.compraDolar(ct, (float) 4.86, 500);



        System.out.println("Segue Informações de sua conta: \n" +
                "Nome do Titular: " + cn.getNome() + "\n" +
                "Agência: " + cn.getAgencia() + "\n" +
                "Conta: " + cn.getNumeroConta() + "\n"
        );

        ct.ConsultaSaldo();
        cp.ConsultaSaldo();
        ci.ConsultaSaldo();


        rg.ComprovanteRecarga();
        cb.comprovanteCompraDolar();
    }
}