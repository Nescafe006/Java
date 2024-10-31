package entidade;

public class ContaCorrente extends Cliente {

    protected float saldo;

    public ContaCorrente(){
        super();

    }
    
    public ContaCorrente(String nome, float saldo){
      
        super(nome);
        this.saldo=saldo;

    }


    public void depositar(float saldo){
        this.saldo += saldo;
    }
    public boolean sacar(double valor) {
        if (valor <= saldo + saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return  "Nome: "
        +nome
        +"\nsaldo: $"
        +String.format("%.2f", saldo)
        +"\ndepósito: $ "
        +String.format("%.2f", saldo)
        +"\nsaque: $ "
        +String.format("%.2f", saldo);
    }

    public boolean transferir(){
      return saldo > 0;
    }
}
