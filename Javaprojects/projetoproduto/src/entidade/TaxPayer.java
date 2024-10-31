package entidade;

public abstract class TaxPayer {

	private String nome;
	private Double rendaanual;
	
	public TaxPayer(String name, Double rendaanual) {
		this.nome = name;
		this.rendaanual = rendaanual;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public Double getrendaanual() {
		return rendaanual;
	}

	public void setAnualIncome(Double rendaanual) {
		this.rendaanual= rendaanual;
	}

	public abstract Double tax();
}