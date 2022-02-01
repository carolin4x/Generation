package entities;

public class Cliente {
	
	//Atributos
	private String name;
	
	private double altura;
	
	private double peso;

	//Construtor
	public Cliente(String nome, double altura, double peso) {
		this.name = nome;
		this.altura = altura;
		this.peso = peso;
	}
	
	public Cliente(String nome, double peso) {
		this.name = nome;
		this.peso = peso;
	}

	//Getter and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//Estudar sobre: Arquitetura de software - SOLID >> importante
	public String imc() {
		double imc = this.peso / (this.altura * this.altura);
		return String.format("%.2f", imc);//2 casas após a virgula
	}
		
	//alt + shift + s para abrir o getters and setters
}