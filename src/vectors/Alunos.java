package vectors;

public class Alunos {

	private String nomeAluno;
	private String emailAluno;
	
	
	public Alunos(String nomeAluno, String emailAluno) {
	
		this.nomeAluno = nomeAluno;
		this.emailAluno = emailAluno;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getEmailAluno() {
		return emailAluno;
	}
	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}
	@Override
	public String toString() {
		return nomeAluno + ", " + emailAluno;
	}
	
	
	
}
