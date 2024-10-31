package entidade;

public class Empregado {

    

    String nome;
   protected float salario;

   public Empregado(String nome, float salario){
    this.nome=nome;
    this.salario=salario;
   }

   public  String getnome(){
    return nome;
   }

   public float getsalario(){
    return salario;
   }

   public void setnome(String nome){
    this.nome=nome;

   }

   public void setsalario(float salario){
    this.salario=salario;
   }


   public String toString(){
   return "Nome: "
   +nome
   +"salario : $ "
   +String.format("%.2f",  salario);

   }

   
}
