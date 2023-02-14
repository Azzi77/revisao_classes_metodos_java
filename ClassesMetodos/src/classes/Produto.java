package classes;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	
	Produto(){
		
	}

	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;		

	}

	double precoComDesconto() { // metodo desconto
		return preco * (1 - desconto);

	}

	double precoComDesconto(double descontoDoGerente) { // metodo desconto com parametro
		return preco * (1 - desconto + descontoDoGerente);
	}

}
