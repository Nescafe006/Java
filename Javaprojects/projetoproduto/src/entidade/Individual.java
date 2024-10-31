package entidade;

public class Individual extends TaxPayer {

	private Double gastossaudes;

	public Individual(String name, Double anualIncome, Double gastossaudes) {
		super(name, anualIncome);
		this.gastossaudes = gastossaudes;
	}

	public Double getgastossaudes() {
		return gastossaudes;
	}

	public void setgastossaudes(Double gastossaudes) {
		this.gastossaudes =gastossaudes;
	}

	@Override
	public Double tax() {
		if (getAnualIncome() < 20000.0) {
			return getAnualIncome() * 0.15 -gastossaudes * 0.5;
		}
		else {
			return getAnualIncome() * 0.25 - gastossaudes* 0.5;
		}
	}
}