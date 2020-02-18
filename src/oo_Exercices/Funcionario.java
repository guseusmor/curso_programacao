package oo_Exercices;

public class Funcionario {

	public String nome;
	public double grossSalary;
	public double tax;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		
		grossSalary += (grossSalary * percentage) / 100;
	}
	@Override
	public String toString() {
		return nome + ", $" + String.format("%.2f", this.netSalary());
	}
	
	
}
