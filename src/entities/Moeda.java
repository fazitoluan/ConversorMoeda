package entities;

public class Moeda {

	private String name;
	private double valorUni;
	
	public Moeda(String name, double valorUni) {
		this.name = name;
		this.valorUni = valorUni;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getValorUni() {
		return this.valorUni;
	}
	
	public void setValorUni(double novoValorUni) {
		if(novoValorUni>0) {
			this.valorUni = novoValorUni;
		}
		else {
			System.out.println("Valor inválido. Portanto, valor unitário da " + this.name + " continua sendo R$" + this.valorUni);
		}
	}
	
	public double totalValor(double quantidade) {
		if(quantidade>0) {
			return quantidade * this.valorUni;
		}
		else {
			System.out.println("Valor inválido, quantidade é menor que 0");
			return 0;
		}
	}
	
}
