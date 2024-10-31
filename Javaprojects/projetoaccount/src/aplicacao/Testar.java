package aplicacao;
import entidade.ContaCorrente;
import entidade.ContaEspecial;


public class Testar {
    public static void main(String[] args)  {

           ContaCorrente contanormal = new ContaCorrente("joao",400f);
           ContaEspecial contaespecial = new ContaEspecial("joana", 300f, 5000f);


          System.out.println("Conta corrente: " + contanormal);
          System.out.println("Conta especial: " + contaespecial);
    }
}
