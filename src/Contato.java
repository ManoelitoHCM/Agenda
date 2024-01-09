
public class Contato {
	
	private String nome;
	private String telefone;
	private String celular;
	private String dataNascimento;
	private String email;
	private Contato pessoa;
	
	public Contato(String nome, String telefone, String celular) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.celular = celular;
	}
	
	public String getContato() {
		System.out.println("O nome do contato é "+ pessoa.getNome()+ ".");
		System.out.println("Seu telefone é "+ pessoa.getTelefone()+ ".");
		System.out.println("Seu celular é "+ pessoa.getCelular()+ ".");
		System.out.println("Seu e-mail é "+ pessoa.getEmail()+ ".");
		System.out.println("Sua data de nascimento é "+ pessoa.getDataNascimento()+ ".");
		return "Operação finalizada";
	}
	
	public void cadastrarContato() {
		
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefone=" + telefone + ", celular=" + celular + ", dataNascimento="
				+ dataNascimento + ", email=" + email + "]";
	}
}