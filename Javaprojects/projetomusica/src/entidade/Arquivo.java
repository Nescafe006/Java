package entidade;


public class Arquivo {

    int kbytes;
    double preco;
    String autor;

    public Arquivo(){

    }

    public Arquivo(int kbytes, double preco, String autor){

        this.kbytes=kbytes;
        this.preco=preco;
        this.autor=autor;

    }

    public int getKbytes() {
        return kbytes;
    }

    public void setKbytes(int kbytes) {
        this.kbytes = kbytes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo(){
        return "Arquivo: ";
    }


    public String getDetalhes(){
        return "kbytes: " + getKbytes() + "\n" +
        "Preco: " + getPreco() + "\n" + 
        "Autor: "+ getAutor() + "\n";
    }
}
