package classes;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		
		Produto p1	= new Produto("Notebook");
		//p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto("Caneta Preta");
		//p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		
	//	double precoFinal1 = p1.preco * (1 - p1.desconto); // esse codigo foi refatorado abaixo
	//	double precoFinal2 = p2.preco * (1 - p2.desconto);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.20); // desconto gerente
		double mediaCarrinho = (precoFinal1 + precoFinal2) /2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		

	}

}