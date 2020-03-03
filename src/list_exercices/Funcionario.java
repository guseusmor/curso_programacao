package list_exercices;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void incrementaSalario(double porcentagem) {
		salario += salario*(porcentagem/100);
	}
}
