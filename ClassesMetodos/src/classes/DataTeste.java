package classes;

public class DataTeste {

	public static void main(String[] args) {
		
		
		Data d1 = new Data();
		d1.dia = 7;
		d1.mes = 11;
		d1.ano = 2023;
		
		var d2 = new Data();
		d2.dia = 31;
		d2.mes = 12;
		d2.ano = 2023;
		
		
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

	}

}
