package animals;

public abstract class Animal {
	
	protected int id;
	protected String tamanho;
	protected int idade;
	protected String animal;
	protected double peso;
	
	public Animal(int id, double peso, String animal, String tamanho) {
		this.id = id;
		this.idade = 0;
		this.peso = peso;
		this.animal = animal;
		this.tamanho = tamanho;
	}

	public int getId() {
		return id;
	}

	public int getIdade() {
		return idade;
	}

	public double getPeso() {
		return peso;
	}
	
	public abstract void crescer();
	
	public String toString() {
		return this.animal + " " + this.id + " - " + this.peso + " - " + this.idade + " - " + this.tamanho;
	}
	
}
