package br.com.poo.balancotrimestral;
import br.com.poo.balancotrimestral.Balancos;
public class BalancoTrimestral {

	public static void main(String[] args) {
		Balancos balancoTrimestral = new Balancos();
		balancoTrimestral.setGastosJaneiro(15000);
		balancoTrimestral.setGastosFevereiro(23000);
		balancoTrimestral.setGastosMarco(17000);
		balancoTrimestral.setGastosAbril(20000);
		System.out.println("Balanço Trimestral de Abril,Março,Fevereiro e Janeiro = " + balancoTrimestral.Soma());

		
		
		
		
		
		
		
		
		

	}

}
