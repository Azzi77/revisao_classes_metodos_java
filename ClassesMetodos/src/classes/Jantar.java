package classes;

public class Jantar {

	public static void main(String[] args) {
		
		
		Comida c1 = new Comida ("Arroz", 0.223);
		
		Comida c2 = new Comida ("Feijão",  0.300);
		
		Pessoa p = new Pessoa ("Joao", 99.8);
		
		
		System.out.println(p.apresentar());  // se apresenta a primeira vez
		p.comer(c1);
		
		System.out.println(p.apresentar());  // se apresentar pela segunda vez 
		p.comer(c2);
		
		System.out.println(p.apresentar());
		
	}
}
