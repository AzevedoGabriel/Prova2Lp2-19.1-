package animals;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class SimulalController {
	
	private HashMap<Integer, Animal> animaisCadastrados;
	private int id;
	private Comparator<Animal> estrategiaDeRemocao;
	
	public SimulalController() {
		this.animaisCadastrados = new HashMap<>();
		this.id = 1;
		this.estrategiaDeRemocao = new OrdenaPorPeso();
	}
	
	public int cadastraCachorroFilhote() {
		this.animaisCadastrados.put(this.id, new Cachorro(this.id));
		this.id++;
		return this.animaisCadastrados.get(this.id-1).getId();
	}
	
	public int cadastraElefanteFilhote() {
		this.animaisCadastrados.put(this.id, new Elefante(this.id));
		this.id++;
		return this.animaisCadastrados.get(this.id-1).getId();
	}
	
	public int cadastraMorcegoFilhote() {
		this.animaisCadastrados.put(this.id, new Morcego(this.id));
		this.id++;
		return this.animaisCadastrados.get(this.id-1).getId();
	}
	
	public String exibirAnimal(int id) {
		if (!(this.animaisCadastrados.containsKey(id))) {
			throw new IllegalArgumentException ("Animal não cadastrado.");
		}
		return this.animaisCadastrados.get(id).toString();
	}
	
	public void crescer(int id) {
		this.animaisCadastrados.get(id).crescer();
	}
	
	public void configurarRemocao(String estrategia) {
		if (estrategia.equals("PESO")) {
			this.estrategiaDeRemocao = new OrdenaPorPeso();
		}
		else if (estrategia.equals("IDADE")) {
			this.estrategiaDeRemocao = new OrdenaPorIdade();
		}
	}
	
	public int remover() {
		List<Animal> animais = new ArrayList<>(this.animaisCadastrados.values());
		Animal animal = Collections.max(animais, this.estrategiaDeRemocao);
		
		
		this.animaisCadastrados.remove(animal.getId());
		return animal.getId();
	}
	
}
