package aplicacao;
import entidade.Gerente;
import entidade.Vendedor;



public class TestarEmpregado {

    public static void main(String[] args){

        Gerente gerente = new Gerente("joao", 4000.00f, "sesi");
        Vendedor vendedor = new Vendedor("joao", 4000.00f, 10.0f);


        System.out.println("Gerente: " + gerente);
        System.out.println("Vendedor: " + vendedor);
 
 


     
    }
}
