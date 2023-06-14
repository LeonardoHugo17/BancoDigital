import java.text.DecimalFormat;

public class Recarga {
   protected float valorTransacao;
   protected String numeroTelefone;
   public void realizarRecarga(ContaCorrente contaCorrente, String numero, float valorRecarga){
       this.valorTransacao = valorRecarga;
       this.numeroTelefone = numero;
       contaCorrente.saqueContaCorrente(valorTransacao);

   }
   public void ComprovanteRecarga(){
       System.out.println("\n" + "\n" + "======COMPROVANTE DE RECARGA======" + "\n" +
               "NÚMERO DE TELEFONE: " + numeroTelefone + "\n" +
               "VALOR DA TRANSAÇÃO: R$ " + new DecimalFormat(".##").format(valorTransacao));
   }
}
