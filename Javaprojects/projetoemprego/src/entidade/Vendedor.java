package entidade;

public class Vendedor extends Empregado {

    float percentualComissao;

    public Vendedor(String nome, float salario, float percentualComissao){
    super(nome, salario);
    this.percentualComissao=percentualComissao;
    }

    public double calcularSalario(double salario, double percentualComissao) {
        return salario + (salario * percentualComissao / 100);
    }


    public String toString(){

        double  calcularSalario = salario + (salario * percentualComissao / 100);
        return "percentual da comissão: "
        +String.format("%.1f%%",  percentualComissao)
        +"\nSalário com comissão: "
        +String.format("%.2f", calcularSalario);
        
    }
}
