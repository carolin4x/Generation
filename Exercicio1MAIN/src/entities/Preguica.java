package entities;

public class Preguica extends Animal { //1- Criar Sub
		
	private String peloPreguica; //2-Criei atributo
	
		//3-Criando Construtor com as Heran�as
		public Preguica(String nomeAnimal, int idadeAnimal, boolean emiteSom, String mobilidade, String peloPreguica) { 
			
			super(nomeAnimal, idadeAnimal, emiteSom, mobilidade);
			this.peloPreguica = peloPreguica;
		}
		
	//4- criar metodos simples
	
		public void infoPreguica() { 
			System.out.print(getNomeAnimal() +" � uma pregui�a que tem "+getIdadeAnimal()+ " anos.");
			if(isEmiteSom()) { 
				System.out.print(" Emite grunhido, ");			
			} else { 
				System.out.print(" N�o emite som, ");
			}
			System.out.println(getMobilidade()+ " o tempo todo e tem o "+ peloPreguica + ".");
			
		}

		public String getPeloPreguica() {
			return peloPreguica;
		}

		public void setPeloPreguica(String peloPreguica) {
			this.peloPreguica = peloPreguica;
		}
		
}
