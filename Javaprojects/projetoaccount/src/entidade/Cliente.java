package entidade;

public class Cliente {
    String nome;


    public Cliente() {

    }

    public Cliente(String nome){
        this.nome=nome;
    }
     

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome=nome;
    }

    public String toString(){
        return "Nome: "
        +nome;
    }
}
