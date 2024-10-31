package entidade;

public class ProdutoUsado extends Produto{

    Date datamanufatura;

    public ProdutoUsado(String name, double preco, Date datamanufatura) {
        super(name, preco);
        this.datamanufatura = datamanufatura;
    }



    

}
