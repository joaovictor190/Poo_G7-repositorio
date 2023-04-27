package br.com.poo.balancotrimestral;

public class Balancos {
	private int gastosJaneiro;
	private int gastosFevereiro;
	private int gastosMarco;
	private int gastosAbril;
	
	public int getGastosJaneiro() {
		return gastosJaneiro;
	}
	public void setGastosJaneiro(int gastosJaneiro) {
		this.gastosJaneiro = gastosJaneiro;
	}
	public int getGastosFevereiro() {
		return gastosFevereiro;
	}
	public void setGastosFevereiro(int gastosFevereiro) {
		this.gastosFevereiro = gastosFevereiro;
	}
	public int getGastosMarco() {
		return gastosMarco;
	}
	public void setGastosMarco(int gastosMarco) {
		this.gastosMarco = gastosMarco; 
	}
    
    public int getGastosAbril() {
    	return gastosAbril;
    }
    public void setGastosAbril(int gastosAbril) {
    	this.gastosAbril = gastosAbril;
    }
	public int Soma() {
		return gastosMarco + gastosFevereiro + gastosJaneiro + gastosAbril;
	}

}
