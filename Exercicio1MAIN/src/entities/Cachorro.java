package entities;

public class Cachorro extends Animal { //1- Criar Subclass

	public String racaCachorro; //2-Criar atributos da SubClass
	
	//3-Criar m�todo construtor puxando da Super e criando da Sub
	public Cachorro(String nomeAnimal, int idadeAnimal, boolean emiteSom, String mobilidade, String racaCachorro) { 
		super(nomeAnimal, idadeAnimal, emiteSom, mobilidade);
		this.racaCachorro = racaCachorro;
	}
	//4-
	public void infoCachorro() { 
		System.out.print(getNomeAnimal() +" � um doguinho que tem "+getIdadeAnimal()+ " anos.");
		if(isEmiteSom()) { 
			System.out.print(" Emite latido, ");			
		} else { 
			System.out.print(" N�o emite som, ");
		}
		System.out.println(getMobilidade()+ " o tempo todo e � da ra�a "+racaCachorro +".");
		
	}
	
	
	
	//5-Criando Getters and Setters
	public String getRacaCachorro() {
		return racaCachorro;
	}
	public void setRacaCachorro(String racaCachorro) {
		this.racaCachorro = racaCachorro;
	}
	
	
}


