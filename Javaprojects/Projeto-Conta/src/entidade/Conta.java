package entidade;

public abstract class Conta {
     

   private  int numero;
   private String nometitular;
   protected double saldo;


    public Conta(){

    }


    public Conta(int numero, String nometitular, double saldo) {
        this.numero = numero;
        this.nometitular = nometitular;
        this.saldo = saldo;
    }



    public int getNumero() {
        return numero;
    }



    public void setNumero(int numero) {
        this.numero = numero;
    }



    public String getNometitular() {
        return nometitular;
    }



    public void setNometitular(String nometitular) {
        this.nometitular = nometitular;
    }



    public double getSaldo() {
        return saldo;
    }


    public void deposito(double valor){
        this.saldo += valor;
    }

   public void sacar(double valor){
      this.saldo -= valor + 5.0;
   }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", nometitular=" + nometitular + ", saldo=" + saldo + "]";
    }

    

    

}
