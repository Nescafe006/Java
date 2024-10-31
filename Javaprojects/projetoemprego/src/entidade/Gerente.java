package entidade;

public class Gerente extends Empregado{

String departamento;

public Gerente(String nome, float salario, String departamento){
    super(nome, salario);
    this.departamento=departamento;
}

public String getdepartamento(){
    return departamento;
}
 public void setdepartamento(String departamento){
    this.departamento=departamento;
 }
 
 public String toString(){
    return "Nome: "
    +nome
    +"\nsalario : $ "
    +String.format("%.2f",  salario)
    +"\nDepartamento: "
    +departamento;
}
}
