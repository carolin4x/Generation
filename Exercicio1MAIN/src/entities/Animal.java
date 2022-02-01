package entities;

/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:
*			Cachorro: nome,idade,emitesom,corre
*			Cavalo: Nome,idade,emite som,Corre
*			Preguiça: Nome, idade, emite som, Sobe Arvore. 
*
*/
	

	public class Animal { //1- Criando Class

		private String nomeAnimal; //2- Criando Atributo
		private int idadeAnimal;
		private boolean emiteSom;
		private String mobilidade;
		
	//3-Criando método construtor da SuperClass
	public Animal(String nomeAnimal, int idadeAnimal, boolean emiteSom, String mobilidade) {
		super();
		this.nomeAnimal = nomeAnimal; //Shift+Alt+S = Generate Constructor and Field
		this.idadeAnimal = idadeAnimal;
		this.emiteSom = emiteSom;
		this.mobilidade = mobilidade;	
	}
	//4- Including Getters and Setters: Shift+Alt+S = Getters and Setters> select all> generate.
	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public int getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public boolean isEmiteSom() {
		return emiteSom;
	}

	public void setEmiteSom(boolean emiteSom) {
		this.emiteSom = emiteSom;
	}

	public String getMobilidade() {
		return mobilidade;
	}

	public void setMobilidade(String mobilidade) {
		this.mobilidade = mobilidade;
	}
	
	
	
	
}
