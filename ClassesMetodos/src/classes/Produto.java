package classes;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeInicial){
		nome = nomeInicial;
		
	}
	
	double precoComDesconto() {      //metodo desconto		
		return preco *(1 - desconto);
		
					
		}
	
	double precoComDesconto(double descontoDoGerente) {      //metodo desconto	com parametro	
		return preco * (1 - desconto + descontoDoGerente);
	}
	
}

