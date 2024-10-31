package entidade;

public class ContaEmpresarial extends Conta {

     double limiteempresarial;

    public ContaEmpresarial() {
       super();
    }

    public ContaEmpresarial(int numero, String nometitular, double saldo, double limiteempresarial) {
        super(numero, nometitular, saldo);
        this.limiteempresarial = limiteempresarial;
    }

    public double getLimiteempresarial() {
        return limiteempresarial;
    }

    public void setLimiteempresarial(double limiteempresarial) {
        this.limiteempresarial = limiteempresarial;
    }

     
@Override
public void sacar(double valor){
    super.sacar(valor);
    saldo -=2.0;
}

}
