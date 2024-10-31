package entidade;

public class Contasalva extends Conta {

    private double taxajuros;

    public Contasalva() {
     super();
    }

    public Contasalva(int numero, String nometitular, double saldo, double taxajuros) {
        super(numero, nometitular, saldo);
        this.taxajuros = taxajuros;
    }

    public double getTaxajuros() {
        return taxajuros;
    }

    public void setTaxajuros(double valor) {
        this.taxajuros += valor;
    }

    @Override
    public final void sacar(double valor){
        saldo -= valor;
    }
  
    
    

}
