package entities;

public class CachorroAbs extends ClassAbsP {

	public CachorroAbs() {  //ddeclarando metodo constutor
		
		super("Cachorro"); //importando da classe abstrata
	}
	
	@Override
	public void som(double quantidade) { 
		quantidade = Math.random()*3.0;
		
		for(int i=0; i<quantidade; i++) { 
		System.out.println("O " +getEspecie() + "faz: Au au au!");
		}
	}
}
