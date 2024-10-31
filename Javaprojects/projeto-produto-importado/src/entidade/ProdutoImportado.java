package entidade;

public class ProdutoImportado extends Produto {

    double taxaalfandegaria;

    public ProdutoImportado(String name, double preco, double taxaalfandegaria) {
        super(name, preco);
        this.taxaalfandegaria = taxaalfandegaria;
    }

    public double getTaxaalfandegaria() {
        return taxaalfandegaria;
    }




    public void setTaxaalfandegaria(double taxaalfandegaria) {
        this.taxaalfandegaria = taxaalfandegaria;
    }


    
    public void etiquetadepreco(){
    }

    public void precototal(){

    }



}
