package entities;

public abstract class ClassAbsP { //decalro calss

	private String especie; // declaro atributo
	
	public ClassAbsP (String especie) { 
		this.especie = especie;
	}
	abstract public void som(double quantidade); //  // declaro metodo abtrato=é um contrato para a filha 
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
}
