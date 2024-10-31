package entidade;

public class ContaEspecial extends ContaCorrente {

   float limite;

   

   public ContaEspecial(){
    super();

   }

   public ContaEspecial(String nome, float saldo, float limite){
     
    super(nome, saldo);
    this.limite=limite;

   }

   public boolean sacar(double valor) {
    if (valor <= saldo + limite) {
        saldo -= valor;
        return true;
    } else {
        return false;
    }
}

   public String toString(){
        return "Nome: "
        +nome
        +"\nsaldo: $"
        + String.format("%.2f", saldo)
        + "\nlimite: $"
        +String.format("%.2f", limite);
   }

}
