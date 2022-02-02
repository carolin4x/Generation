package entities;

public class CavaloAbs extends ClassAbsP {

	public CavaloAbs() {  //ddeclarando metodo constutor
		
		super("Cavalo"); //importando da classe abstrata
	}
	
	@Override
	public void som(double quantidade) { 
		quantidade = Math.random()*3.0;
		
		for(int i=0; i<quantidade; i++) { 
		System.out.println("O " +getEspecie() +  "faz: Inrrrri inrrri!");
		}
	}
}
