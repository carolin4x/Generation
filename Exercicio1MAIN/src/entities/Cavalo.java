package entities;

public class Cavalo extends Animal { //1-Criar Sub
	
	private String corCavalo; //2-Criar Atributos
	
	//3-Criando Construtor com as Heran�as
	public Cavalo(String nomeAnimal, int idadeAnimal, boolean emiteSom, String mobilidade, String corCavalo) { 
		
		super(nomeAnimal, idadeAnimal, emiteSom, mobilidade);
		this.corCavalo = corCavalo;		
	}
//4- Criando metodos simples
	public void infoCavalo() { 
		System.out.print(getNomeAnimal() +" � um cavalo que tem "+getIdadeAnimal()+ " anos.");
		if(isEmiteSom()) { 
			System.out.print(" Relincha, ");			
		} else { 
			System.out.print(" N�o relincha, ");
		}
		System.out.println(getMobilidade()+ " o tempo todo e � da cor "+corCavalo +".");
		
	}
	public String getCorCavalo() {
		return corCavalo;
	}
	public void setCorCavalo(String corCavalo) {
		this.corCavalo = corCavalo;
	}
	
	
}
