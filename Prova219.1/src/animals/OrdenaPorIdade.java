package animals;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		if(o1.getIdade() > o2.getIdade()) {
			return 1;
		}
		else if(o1.getIdade() == o2.getIdade()) {
			return 0;
		}
		return -1;
	}

}
